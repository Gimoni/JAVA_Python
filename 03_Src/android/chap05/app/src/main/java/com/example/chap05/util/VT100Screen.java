package com.example.chap05.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class VT100Screen extends View {

    public VT100Screen(Context context) {
        super(context);
        init();
    }

    public VT100Screen(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VT100Screen(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public VT100Screen(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    int[] colors = {
            android.graphics.Color.BLACK,
            android.graphics.Color.RED,
            android.graphics.Color.GREEN,
            android.graphics.Color.YELLOW,
            android.graphics.Color.BLUE,
            android.graphics.Color.MAGENTA,
            android.graphics.Color.CYAN,
            android.graphics.Color.WHITE
    };

    int[][][] space;

    Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
    int textSize = 50;
    int lineSize = 80;
    int columnSize = 160;

    private float fHeight;
    private float fWidth;
    private float fBaseline;

    private int fg;
    private int bg;
    private int line;
    private int column;

    void init() {
        p.setTypeface(Typeface.MONOSPACE);
        p.setTextSize(textSize);
        space = new int[3][lineSize][columnSize];

        fHeight = Math.abs(p.ascent()) + Math.abs(p.descent());
        float[] value = new float[1];
        p.getTextWidths("A", value);
        fWidth = value[0];
        fBaseline = p.descent();

        fg = 7; // White
        bg = 0; // Black
        line = 1;
        column = 1;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        p.setColor(android.graphics.Color.BLACK);
        canvas.drawRect(0, 0, columnSize * fWidth, lineSize * fHeight, p);

        for (int i = 0; i < space[0].length; i++)
            for (int j = 0; j < space[0][i].length; j++) {

                if (space[1][i][j] == 0 && space[2][i][j] == 0)
                    continue;

                char ch = (char) space[0][i][j];
                int fg = space[1][i][j];
                int bg = space[2][i][j];

                p.setColor(colors[bg]);
                canvas.drawRect(j * fWidth, i * fHeight, j * fWidth + fWidth, i * fHeight + fHeight, p);
                p.setColor(colors[fg]);
                canvas.drawText(ch + "", j * fWidth, (i + 1) * fHeight - fBaseline, p);
            }
    }

    //    @Override
    protected void onDraw2(Canvas canvas) {
//        super.onDraw(canvas);

        Bitmap background = Bitmap.createBitmap((int) (columnSize * fWidth), (int) (lineSize * fHeight), Bitmap.Config.ARGB_8888);
        Canvas imgCanvas = new Canvas(background);

        p.setColor(android.graphics.Color.BLACK);
        imgCanvas.drawRect(0, 0, columnSize * fWidth, lineSize * fHeight, p);

        for (int i = 0; i < space[0].length; i++)
            for (int j = 0; j < space[0][i].length; j++) {

                if (space[1][i][j] == 0 && space[2][i][j] == 0)
                    continue;

                char ch = (char) space[0][i][j];
                int fg = space[1][i][j];
                int bg = space[2][i][j];

                p.setColor(colors[bg]);
                imgCanvas.drawRect(j * fWidth, i * fHeight, j * fWidth + fWidth, i * fHeight + fHeight, p);
                p.setColor(colors[fg]);
                imgCanvas.drawText(ch + "", j * fWidth, (i + 1) * fHeight - fBaseline, p);
            }

        canvas.drawBitmap(background, 0, 0, p);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int wMode, hMode;
        int wSpec, hSpec;
        int Width, Height;

        Width = (int) (fWidth * 40); // 폭(Width) = 150
        Height = (int) (fHeight * 80); // 높이(Height) = 80

        wMode = MeasureSpec.getMode(widthMeasureSpec);
        wSpec = MeasureSpec.getSize(widthMeasureSpec);
        hMode = MeasureSpec.getMode(heightMeasureSpec);
        hSpec = MeasureSpec.getSize(heightMeasureSpec);

        switch (wMode) {
            case MeasureSpec.AT_MOST: // 부모가 위젯에게 허용된 최대한의 크기를 알려준다.
                // 차일드가 가질 수 있는 최대 크기.
                // 차일드는 이 값 이하로 크기를 결정해야 한다.
                Width = Math.min(wSpec, Width);
                System.out.println("MeasureSpec.AT_MOST");
                break;
            case MeasureSpec.EXACTLY:  // 부모가 제안한 폭을 사용하면 된다.
                // 차일드가 가져야 하는 정확한 크기.
                Width = wSpec;
                System.out.println("MeasureSpec.EXACTLY");
                break;
            case MeasureSpec.UNSPECIFIED: // 별다를 제한없이 원하는 크기를 지정한다.
                System.out.println("MeasureSpec.UNSPECIFIED");
                break;
        }

        switch (hMode) {
            case MeasureSpec.AT_MOST:
                Height = Math.min(hSpec, Height);
                break;
            case MeasureSpec.EXACTLY:
                Height = hSpec;
                break;
            case MeasureSpec.UNSPECIFIED:
                break;
        }

        setMeasuredDimension(Width, Height); // 최종 결정된 WIdth와 Height를 전달.
    }

    public void clearScreen() {
        post(() -> {
            for (int i = 0; i < space[0].length; i++) {
                for (int j = 0; j < space[0][i].length; j++) {
                    space[0][i][j] = 0;
                    space[1][i][j] = 0;
                    space[2][i][j] = 0;
                }
            }
            invalidate();
        });
    }

    public void cursorMove(int line, int column) {
        post(() -> {
            if ((line >= 1 && line <= lineSize) && (column >= 1 && column <= columnSize)) {
                this.line = line;
                this.column = column;
            }
        });
    }

    public void setForeground(int fg) {
        post(() -> {
            if (30 <= fg && fg < 38)
                this.fg = fg % 10;
        });
    }

    public void setForeground(Color fg) {
        setForeground(30 + fg.ordinal());
    }

    public void setBackground(int bg) {
        post(() -> {
            if (40 <= bg && bg < 48)
                this.bg = bg % 10;
        });
    }

    public void setBackground(Color bg) {
        setBackground(40 + bg.ordinal());
    }

    public void reset() {
        post(() -> {
            this.fg = 7;    // White
            this.bg = 0;    // Black
        });
    }

    public void print(char ch) {
        post(() -> {
            if (ch == '\n') {
                line++;
                column = 1;
            } else {
                space[0][line - 1][column - 1] = ch;
                space[1][line - 1][column - 1] = fg;
                space[2][line - 1][column - 1] = bg;
                column++;
            }
            invalidate();
        });
    }

    public void print(String str) {
        for (int i = 0; i < str.length(); i++) {
            print(str.charAt(i));
        }
    }

    public void println(String str) {
        print(str);
        print('\n');
    }

}