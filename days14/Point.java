package days14;

public class Point {
	   
	   // field
	   public int x = 0;
	   public int y = 0;
	   /* 15일차 Ex04 때 변경
	   public Point(int i, int j) {
		x = i;
		y = j;
	}
	    */
	// method
	   public void dispXY() {
	      System.out.printf("> x=%d, y=%d\n", this.x, this.y);
	   }
	   
	   // p1.movePoint()
	   public void movePoint(int pos) {
	      this.x += pos;
	      this.y += pos;
	   }
	   
	   // p1.moveNewPoint(50);
	   // 리턴자료형 Point 참조타입
	   public Point moveNewPoint(int pos) {
	      int newx = this.x + pos;
	      int newy = this.y + pos;
	      
	      Point p = new Point();
	      p.x = newx;
	      p.y = newy;
	      return p;
	   }

	   // p1.plusPoint(p2);
	   public void plusPoint(Point p2) {
	      x += p2.x;
	      y += p2.y;
	      
	   }

	}
