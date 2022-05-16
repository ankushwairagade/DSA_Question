package com.ankush._13_Backtracking;

import java.util.ArrayList;

public class MazeAllPath {


        public static void main(String[] args) {
            boolean[][] maze={
                    {true,true,true},
                    {true,false,true},
                    {true,true,true}
            };
            // MazeAllPath("",maze , 0,0);
            System.out.println(MazeAllPathRet("",maze,0,0));
    }

    static void MazeAllPath(String p ,boolean [][] maze , int r, int c)
    {
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }


        // move into all direction
        ArrayList<String> ls = new ArrayList<>();
        if(!maze[r][c]) return;

        // if it is not false
        maze[r][c] =false;
        if(r < maze.length-1) {
            MazeAllPath(p+"R",maze,r+1,c); // move Right
        }

        if( c< maze[0].length-1){
            MazeAllPath(p+"D",maze,r,c+1); // move Down
        }

        if(r>0){
            MazeAllPath(p+"U",maze,r-1,c); // move UP
        }
        if(c>0){
            MazeAllPath(p+"L",maze,r,c-1); // move Left
        }

        // false kiya hai usko true krdo
        maze[r][c]=true;
    }

    static ArrayList<String> MazeAllPathRet(String p ,boolean [][] maze , int r, int c)
    {
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            //  System.out.println(p);
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        ArrayList<String> Re = new ArrayList<>();
        // move into all direction

        if(!maze[r][c]) return Re;

        // if it is not false
        maze[r][c] =false;
        if(r < maze.length-1) {
            ArrayList<String> Down = MazeAllPathRet(p+"D",maze,r+1,c); // move Right
            Re.addAll(Down);
        }

        if( c< maze[0].length-1){
            ArrayList<String> Left =  MazeAllPathRet(p+"L",maze,r,c+1); // move Down
            Re.addAll(Left);
        }

        if(r>0){
            ArrayList<String> Up =  MazeAllPathRet(p+"U",maze,r-1,c); // move UP
            Re.addAll(Up);
        }
        if(c>0){
            ArrayList<String> Right =  MazeAllPathRet(p+"R",maze,r,c-1); // move Left
            Re.addAll(Right);
        }

        // false kiya hai usko true krdo
        maze[r][c]=true;
        return Re;
    }
}
