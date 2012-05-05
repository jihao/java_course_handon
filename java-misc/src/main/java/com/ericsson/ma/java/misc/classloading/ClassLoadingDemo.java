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
package com.ericsson.ma.java.misc.classloading;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

import com.ericsson.ma.java.misc.jaxp.JaxpDemo;

/**
 * @author honnix
 */
public class ClassLoadingDemo {
    public static void main(String[] args) throws Exception {
        System.out.println(ClassLoadingDemo.class.getClassLoader());
        System.out.println(Class.class.getClassLoader());
    }
}
