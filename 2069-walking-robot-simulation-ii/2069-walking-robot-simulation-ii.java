class Robot {
    int width, height;
    int perimeter;
    int totalSteps = 0;

    int x = 0, y = 0;
    int current_direction = 1; // 0=N,1=E,2=S,3=W

    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
        this.perimeter = 2 * (width + height - 2);
    }
    
    public void step(int num) {
        totalSteps = (totalSteps + num) % perimeter;

        int red = totalSteps;

        // 🔴 special case
        if (red == 0) {
            x = 0;
            y = 0;
            current_direction = 2; // South
            return;
        }

        // 🟢 bottom edge (left → right)
        if (red <= width - 1) {
            x = red;
            y = 0;
            current_direction = 1; // East
        }
        // 🟢 right edge (bottom → top)
        else if (red <= (width - 1) + (height - 1)) {
            x = width - 1;
            y = red - (width - 1);
            current_direction = 0; // North
        }
        // 🟢 top edge (right → left)
        else if (red <= (width - 1) + (height - 1) + (width - 1)) {
            x = (width - 1) - (red - (width - 1) - (height - 1));
            y = height - 1;
            current_direction = 3; // West
        }
        // 🟢 left edge (top → bottom)
        else {
            x = 0;
            y = (height - 1) - (red - (width - 1) - (height - 1) - (width - 1));
            current_direction = 2; // South
        }
    }
    
    public int[] getPos() {
        return new int[]{x, y};
    }
    
    public String getDir() {
        if (current_direction == 0) return "North";
        if (current_direction == 1) return "East";
        if (current_direction == 2) return "South";
        return "West";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */