/*  1 */ public class App {
         public double calcularDesconto(double rendimento) {
/*  2 */         if (rendimento < 0) {
/*  3 */             throw new IllegalArgumentException("Rendimento inválido");
                 }
/*  4 */         if (rendimento <= 5000.00) {
/*  5 */             return 0.0; // Isento / sem imposto
                 }
/*  6 */         else if (rendimento <= 5500.00) {
/*  7 */             return rendimento * 0.075; // Alíquota de 7.5%
                 }
/*  8 */         else if (rendimento <= 6000.00) {
/*  9 */             return rendimento * 0.15; // Alíquota de 15%
                 }
/* 10 */         else if (rendimento <= 6500.00) {
/* 11 */             return rendimento * 0.225; // Alíquota de 22.5%
                 }
/* 12 */         else if (rendimento <= 7350.00) {
/* 13 */             return rendimento * 0.275; // Alíquota de 27.5%
                 }
/* 14 */         else {
/* 15 */             return rendimento * 0.30; // Alíquota máxima de 30%
                 }
             }
         }