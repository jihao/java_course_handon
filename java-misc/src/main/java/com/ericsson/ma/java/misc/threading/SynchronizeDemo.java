/**
 * Created : 02.27, 2012
 *
 * Copyright : (C) 2012 by Honnix
 * Email     : hxliang1982@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.ericsson.ma.java.misc.threading;

/**
 * @author honnix
 */
public class SynchronizeDemo {
    private static int i = 1;

    private void print() {
        ++i;
        System.out.println("Hello World!" + i);
    }

    public static void main(String[] args) {
        final SynchronizeDemo demo1 = new SynchronizeDemo();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                demo1.print();
                ;
            }
        };
        new Thread(runnable).start();

        SynchronizeDemo demo2 = new SynchronizeDemo();
        demo2.print();
    }
}
