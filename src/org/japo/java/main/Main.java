/* 
 * Copyright Copyright 2022 Javier Timoneda Marti - xavix2001xq@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;
// import del SCANNER
import java.util.Locale;
import java.util.Scanner;
// IMPORT DEL RANDOM
import java.util.Random;
/**
 *
 * @author Javier Timoneda Marti
 */
public class Main {
    //Codigo necesario para la entrada standar SOLO PONERLO PARA LA ENTRADA SI NO NO PONER
    public static final Scanner SCN = 
	  new Scanner(System.in, "Windows-1252")
	  .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    
    //Codigo necesario para generar numeros aleatorio, borrar si no se piensa generar numeros aleatorios.
    
    public static final Random RND = new Random();
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }
}
