/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_lab;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Barreda_Carlos_Control {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lea = new Scanner(System.in);

        while (true) {
            System.out.println("---Menu---");
            System.out.println("Seleccione una opcion:");
            System.out.println("1 Cadena");
            System.out.println("2 Notas");
            System.out.println("3 Clases");
            System.out.println("4 Salir");

            int opcion = lea.nextInt();

            if ( opcion == 1){
                int contador = 0, numeroletras = 0, conteomaximo = 0;
                char conteo = 0, caractermasrepetido = 0;

                System.out.println("Ingrese la cadena de caracteres: ");
                lea.nextLine();
                String input = lea.nextLine();

                numeroletras = input.length();

                while (conteo < 256) {
                    int conteo1 = 0;
                    int contadorcaracter = 0;

                    while (contadorcaracter < numeroletras) {
                        if (input.charAt(contadorcaracter) == conteo) {
                            conteo1++;
                        }
                        contadorcaracter++;
                    }
                    if (conteo1 > conteomaximo) {
                        conteomaximo = conteo1;
                        caractermasrepetido = conteo;
                    }
                    conteo++;
                }

                System.out.println("El caracter que mas se repite es: " + caractermasrepetido);
                System.out.println("Numero de veces que se repite: " + conteomaximo);

            } else if (opcion == 2) {
                
                int contador = 0;
                int nota1 = 0;
                int notamenor = 101;
                int notamayor = -1;
                double notas = 0;
                double promedio = 0;
        
                System.out.println("Ingrese la cantidad de notas: ");
                int cantidadNotas = lea.nextInt();

                while (contador < cantidadNotas) {
                    System.out.println("Ingrese la nota " + (contador + 1) + " (0 a 100):");
                    nota1 = lea.nextInt();
            
                    while (nota1 < 0 || nota1 > 100) {
                        System.out.println("Nota invalida. Ingrese nuevamente la nota " + (contador + 1) + " (0 a 100):");
                        nota1 = lea.nextInt();
                    }
            
                notas += nota1;
                if (nota1 > notamayor) {
                    notamayor = nota1;
                }
                if (nota1 < notamenor) {
                    notamenor = nota1;
                }
            
                contador++;
                }
        
                promedio = notas / cantidadNotas;

                System.out.printf("Promedio de las notas: %.2f%n", promedio);
                System.out.println("Nota mayor: " + notamayor);
                System.out.println("Nota menor: " + notamenor);
              
                
            

            }else if (opcion == 3) {
                while (true) {
                    String fecha;
                    System.out.println("Ingrese la fecha (dia,DD/MM)");
                    fecha = lea.next();
                    String dia = fecha.substring(fecha.indexOf(',') + 1, fecha.indexOf('/')).trim();
                    String mes = fecha.substring(fecha.indexOf('/') + 1);
                    String diaSemana = fecha.substring(0, fecha.indexOf(',')).trim().toLowerCase();
                    int mesInt = Integer.parseInt(mes);
                    int diaInt = Integer.parseInt(dia);

                    if (mesInt > 0 && mesInt < 13 && diaInt > 0 && diaInt < 32) {
                        if (diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miercoles")) {
                            while (true) {
                                System.out.println("Se tomaron examenes ese dia? (SI/NO): ");
                                String examen = lea.next().toLowerCase();

                                if (examen.equals("si")) {
                                    System.out.print("Alumnos Aprobados: ");
                                    int aprobados = lea.nextInt();
                                    System.out.print("Alumnos Desaprobados: ");
                                    int desaprobados = lea.nextInt();

                                    int TotalAlumnos = aprobados + desaprobados;
                                    double porcentajeAlumnos = (aprobados / (double) TotalAlumnos) * 100;

                                    System.out.printf("El porcentaje de alumnos aprobados es : %.2f%%\n", porcentajeAlumnos);
                                    break;
                                } else if (examen.equals("no")) {
                                    break;
                                } else {
                                    System.out.println("Entrada invalida. Intente de nuevo.");
                                }
                            }
                        } else if (diaSemana.equals("jueves")) {
                            while (true) {
                                System.out.print("Porcentaje de asistencia: ");
                                double asistencia = lea.nextDouble();
                                if (asistencia >= 0 && asistencia <= 100) {
                                    System.out.println(asistencia > 50 ? "Asistio la mayoria." : "No asistio la mayoria.");
                                    break;
                                } else {
                                    System.out.println("Porcentaje invalido. Intente de nuevo.");
                                }
                            }
                        } else if (diaSemana.equals("viernes")) {
                            if ((diaInt == 1 && (mesInt == 1 || mesInt == 7))) {
                                while (true) {
                                    System.out.print("Alumnos nuevos: ");
                                    int alumnos = lea.nextInt();
                                    System.out.print("Precio por alumno: ");
                                    double precio = lea.nextDouble();
                                    if (alumnos >= 0 && precio >= 0) {
                                        System.out.printf("Ingreso total: $%.2f\n", alumnos * precio);
                                        break;
                                    } else {
                                        System.out.println("Entrada invalida. Intente de nuevo.");
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        System.out.println("Se produjo un error (Fecha Incorrecta). Intente de nuevo.");
                        }
                }     
            }
           
        }
    }

}

