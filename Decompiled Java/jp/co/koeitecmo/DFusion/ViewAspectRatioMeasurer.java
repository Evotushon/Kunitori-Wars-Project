package jp.co.koeitecmo.DFusion;

import android.view.View;

public class ViewAspectRatioMeasurer {
    private double aspectRatio;
    private Integer measuredHeight = null;
    private Integer measuredWidth = null;

    public ViewAspectRatioMeasurer(double d) {
        this.aspectRatio = d;
    }

    public void measure(int i, int i2) {
        measure(i, i2, this.aspectRatio);
    }

    public void measure(int i, int i2, double d) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int i4 = Integer.MAX_VALUE;
        if (mode == 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        if (mode2 == 1073741824 && mode == 1073741824) {
            this.measuredWidth = Integer.valueOf(i3);
            this.measuredHeight = Integer.valueOf(i4);
        } else if (mode2 == 1073741824) {
            double d2 = (double) i3;
            Double.isNaN(d2);
            this.measuredHeight = Integer.valueOf((int) Math.min((double) i4, d2 / d));
            double intValue = (double) this.measuredHeight.intValue();
            Double.isNaN(intValue);
            this.measuredWidth = Integer.valueOf((int) (intValue * d));
        } else if (mode == 1073741824) {
            double d3 = (double) i4;
            Double.isNaN(d3);
            this.measuredWidth = Integer.valueOf((int) Math.min((double) i3, d3 * d));
            double intValue2 = (double) this.measuredWidth.intValue();
            Double.isNaN(intValue2);
            this.measuredHeight = Integer.valueOf((int) (intValue2 / d));
        } else {
            double d4 = (double) i4;
            Double.isNaN(d4);
            if (((double) i3) > d4 * d) {
                this.measuredHeight = Integer.valueOf(i4);
                double intValue3 = (double) this.measuredHeight.intValue();
                Double.isNaN(intValue3);
                this.measuredWidth = Integer.valueOf((int) (intValue3 * d));
                return;
            }
            this.measuredWidth = Integer.valueOf(i3);
            double intValue4 = (double) this.measuredWidth.intValue();
            Double.isNaN(intValue4);
            this.measuredHeight = Integer.valueOf((int) (intValue4 / d));
        }
    }

    public int getMeasuredWidth() {
        Integer num = this.measuredWidth;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("You need to run measure() before trying to get measured dimensions");
    }

    public int getMeasuredHeight() {
        Integer num = this.measuredHeight;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("You need to run measure() before trying to get measured dimensions");
    }
}
