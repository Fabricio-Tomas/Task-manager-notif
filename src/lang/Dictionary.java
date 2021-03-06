package lang;

import java.util.HashMap;

/**
 * Dictionaty
 */
public class Dictionary {

 public static HashMap<Integer, HashMap<Integer, String>> lang;

 public static final int spanishLang = 0;
 public static final int englishLang = 1;

 private static int selectedLang = 0;

 public static final int day1 = 0;
 public static final int day2 = 1;
 public static final int day3 = 2;
 public static final int day4 = 3;
 public static final int day5 = 4;
 public static final int day6 = 5;
 public static final int day7 = 6;
 public static final int options = 7;
 public static final int theme = 8;
 public static final int darkTheme = 9;
 public static final int whiteTheme = 10;
 public static final int title = 11;
 public static final int languaje = 12;
 public static final int spanish = 13;
 public static final int english = 14;
 public static final int user = 15;
 public static final int mailsettings = 16;
 public static final int wspsettings = 17;
 public static final int notiftitle = 18;

 public static final int mail_settings_title = 19;
 public static final int mail_settings_desc = 20;
 public static final int wsp_settings_title = 23;
 public static final int wsp_settings_desc = 24;
 
 public static final int cancel = 21;
 public static final int accept = 22;

 public static void init() {

  lang = new HashMap<Integer, HashMap<Integer, String>>();

  lang.put(spanishLang, new HashMap<Integer, String>());
  lang.put(englishLang, new HashMap<Integer, String>());

  // SPANISH

  lang.get(spanishLang).put(day1, "Domingo");
  lang.get(spanishLang).put(day2, "Lunes");
  lang.get(spanishLang).put(day3, "Martes");
  lang.get(spanishLang).put(day4, "Miércoles");
  lang.get(spanishLang).put(day5, "Jueves");
  lang.get(spanishLang).put(day6, "Viernes");
  lang.get(spanishLang).put(day7, "Sábado");
  lang.get(spanishLang).put(options, "Opciones");
  lang.get(spanishLang).put(theme, "Tema");
  lang.get(spanishLang).put(whiteTheme, "Tema Claro");
  lang.get(spanishLang).put(darkTheme, "Tema Oscuro");
  lang.get(spanishLang).put(title, "Organizador de Tareas");
  lang.get(spanishLang).put(languaje, "Lenguaje");
  lang.get(spanishLang).put(spanish, "Español");
  lang.get(spanishLang).put(english, "Inglés");
  lang.get(spanishLang).put(user, "Usuario");
  lang.get(spanishLang).put(mailsettings, "Establecer dirección de correo");
  lang.get(spanishLang).put(wspsettings, "Establecer número de WhatsApp");
  lang.get(spanishLang).put(notiftitle, "Notificación Tarea Semanal: ");
  lang.get(spanishLang).put(mail_settings_title, "Registrar Correo");
  lang.get(spanishLang).put(mail_settings_desc, "Correo electrónico:");
  lang.get(spanishLang).put(wsp_settings_title, "Registrar número");
  lang.get(spanishLang).put(wsp_settings_desc, "Número de WhatsApp:");
  lang.get(spanishLang).put(cancel, "Cancelar");
  lang.get(spanishLang).put(accept, "Aceptar");

  // English

  lang.get(englishLang).put(day1, "Sunday");
  lang.get(englishLang).put(day2, "Monday");
  lang.get(englishLang).put(day3, "Tuesday");
  lang.get(englishLang).put(day4, "Wednesday");
  lang.get(englishLang).put(day5, "Thursday");
  lang.get(englishLang).put(day6, "Friday");
  lang.get(englishLang).put(day7, "Saturday");
  lang.get(englishLang).put(options, "Options");
  lang.get(englishLang).put(theme, "Theme");
  lang.get(englishLang).put(darkTheme, "Dark Theme");
  lang.get(englishLang).put(whiteTheme, "White Theme");
  lang.get(englishLang).put(title, "Task Manager");
  lang.get(englishLang).put(languaje, "Languaje");
  lang.get(englishLang).put(spanish, "Spanish");
  lang.get(englishLang).put(english, "English");
  lang.get(englishLang).put(user, "User");
  lang.get(englishLang).put(mailsettings, "Set email address");
  lang.get(englishLang).put(wspsettings, "Set WhatsApp number");
  lang.get(englishLang).put(notiftitle, "Weekly Task Notification: ");
  lang.get(englishLang).put(mail_settings_title, "Mail Registration");
  lang.get(englishLang).put(mail_settings_desc, "Email address:");
  lang.get(englishLang).put(wsp_settings_title, "Number registration");
  lang.get(englishLang).put(wsp_settings_desc, "WhatsApp number:");
  lang.get(englishLang).put(cancel, "Cancel");
  lang.get(englishLang).put(accept, "Accept");

 }

 public static String get(int word) {

  return lang.get(selectedLang).get(word);

 }

 public static void changeLang(int newlang) {

  if (newlang < 0 && newlang > 1)
   return;

  System.out.println("lang changed");
  selectedLang = newlang;

 }

 public static int getLangSelected(){
  return selectedLang;
 }

}
