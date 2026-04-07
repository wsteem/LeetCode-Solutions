class Robot {
    private int width;
    private int height;
    private int x = 0;
    private int y = 0;
    private String direction = "East";

    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void step(int num) {
        int perimeter = 2 * (width - 1) + 2 * (height - 1);
        
        // Edge Case: If we move a full lap (or more), we end up at (0,0)
        // but facing South because we "arrived" there from the North.
        if (num >= perimeter) {
            num %= perimeter;
            if (x == 0 && y == 0) direction = "South";
        }

        while (num > 0) {
            if (direction.equals("East")) {
                int canMove = (width - 1) - x;
                int steps = Math.min(num, canMove);
                x += steps;
                num -= steps;
                if (num > 0) direction = "North";
            } 
            else if (direction.equals("North")) {
                int canMove = (height - 1) - y;
                int steps = Math.min(num, canMove);
                y += steps;
                num -= steps;
                if (num > 0) direction = "West";
            } 
            else if (direction.equals("West")) {
                int canMove = x; // distance to x=0
                int steps = Math.min(num, canMove);
                x -= steps;
                num -= steps;
                if (num > 0) direction = "South";
            } 
            else if (direction.equals("South")) {
                int canMove = y; // distance to y=0
                int steps = Math.min(num, canMove);
                y -= steps;
                num -= steps;
                if (num > 0) direction = "East";
            }
        }
    }

    public int[] getPos() {
        return new int[]{x, y};
    }

    public String getDir() {
        return direction;
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
