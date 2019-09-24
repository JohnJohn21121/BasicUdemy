package com.JohnJohn21121;

public class Main {

    public static void main(String[] args) {

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets <0){
            return -1;
        }
        double walArea = width * height;
        return (int)(Math.ceil(((walArea / areaPerBucket) - extraBuckets)));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            return -1;
        }
        double walArea = width * height;
        return (int)(Math.ceil((walArea / areaPerBucket)));
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0 ){
            return -1;
        }
        return (int)(Math.ceil((area / areaPerBucket)));
    }
}
