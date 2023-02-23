package com.example.movietracker;

public class GridModelClass {

        private String movie_name;
        private int imgid;

        public GridModelClass(String movie_name, int imgid) {
            this.movie_name = movie_name;
            this.imgid = imgid;
        }

        public String getCourse_name() {
            return movie_name;
        }

        public void setCourse_name(String movie_name) {
            this.movie_name = movie_name;
        }

        public int getImgid() {
            return imgid;
        }

        public void setImgid(int imgid) {
            this.imgid = imgid;
        }


}
