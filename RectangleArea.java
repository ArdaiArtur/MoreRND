public class RectangleArea {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int a1=Math.abs(ax1-ax2)*Math.abs(ay1-ay2);
        int a2=Math.abs(bx1-bx2)*Math.abs(by1-by2);
        int xd=Math.min(ax2, bx2)-Math.max(ax1, bx1);
        int yd= Math.min(ay2, by2)-Math.max(ay1, by1);
        int a3=0;
        if(xd>0&&yd>0)
        a3=xd*yd;
       
        /*int a3x1=Math.max(ax1, bx1);
        int a3y1=Math.max(ay1, by1);
        int a3x2=Math.min(ax2, bx2);
        int a3y2=Math.min(ay2, by2);
        int a3=Math.abs(a3x1-a3x2)*Math.abs(a3y1-a3y2);
            */
        return a1+a2-a3;

    }
}
