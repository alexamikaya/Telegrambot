import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.*;

public class Main  extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "Kotlytkr_bot";
    }

    @Override
    public String getBotToken() {
        return "2130528569:AAFsWsm7sJQJs9iC9qAVJ4dLtxgf68hlSBE";
    }

    @SneakyThrows
    @Override

    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            if (message_text.equals("/start")) {
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chat_id));
                message.setText("Добро пожаловать в Телеграм  завода Броня");

                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("Обучение \uD83D\uDCDA");
                row.add("Новости \uD83D\uDDD3");
                row.add("Статьи \uD83D\uDD16");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("Отзывы \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66");
                row.add("Медиабанк \uD83C\uDFDB");
                row.add("Подписка \uD83D\uDCE9");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                message.setReplyMarkup(keyboardMarkup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            if (message_text.equals("Статьи \uD83D\uDD16")) {
                Document doc = Jsoup.connect("https://kotly-tkr.ru/blog-ru/").get();
                // Elements extends ArrayList<Element>.

                String cssQuery = "a[href*=/blog-ru/]";
                Elements elements = doc.select(cssQuery);
                Iterator<Element> iterator = elements.iterator();
                while (iterator.hasNext()) {
                    Element xx = iterator.next();
                    SendMessage message = new SendMessage();
                    message.setChatId(String.valueOf(chat_id));
                    message.setText(xx.attr("href"));

                    ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                    List<KeyboardRow> keyboard = new ArrayList<>();
                    KeyboardRow row = new KeyboardRow();
                    row.add("Обучение \uD83D\uDCDA");
                    row.add("Новости \uD83D\uDDD3");
                    row.add("Статьи \uD83D\uDD16");
                    keyboard.add(row);
                    row = new KeyboardRow();
                    row.add("Отзывы \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66");
                    row.add("Медиабанк \uD83C\uDFDB");
                    row.add("Подписка \uD83D\uDCE9");
                    keyboard.add(row);
                    keyboardMarkup.setKeyboard(keyboard);
                    message.setReplyMarkup(keyboardMarkup);
                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

            }
            if (message_text.equals("Отзывы \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66")) {
                Document doc = Jsoup.connect("https://vk.com/video/playlist/-198807732_1").get();
                // Elements extends ArrayList<Element>.

                String cssQuery = "a[href*=/video-]";
                Elements elements = doc.select(cssQuery);
                Iterator<Element> iterator = elements.iterator();
                while (iterator.hasNext()) {
                    Element xx = iterator.next();
                    SendMessage message = new SendMessage();
                    message.setChatId(String.valueOf(chat_id));
                    message.setText("https://vk.com"+ xx.attr("href"));

                    ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                    List<KeyboardRow> keyboard = new ArrayList<>();
                    KeyboardRow row = new KeyboardRow();
                    row.add("Обучение \uD83D\uDCDA");
                    row.add("Новости \uD83D\uDDD3");
                    row.add("Статьи \uD83D\uDD16");
                    keyboard.add(row);
                    row = new KeyboardRow();
                    row.add("Отзывы \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66");
                    row.add("Медиабанк \uD83C\uDFDB");
                    row.add("Подписка \uD83D\uDCE9");
                    keyboard.add(row);
                    keyboardMarkup.setKeyboard(keyboard);
                    message.setReplyMarkup(keyboardMarkup);
                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

            }
            if (message_text.equals("Медиабанк \uD83C\uDFDB")) {

                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chat_id));
                message.setText("https://disk.yandex.ru/d/ROgbFp6afqJYvQ");

                ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboard = new ArrayList<>();
                KeyboardRow row = new KeyboardRow();
                row.add("Обучение \uD83D\uDCDA");
                row.add("Новости \uD83D\uDDD3");
                row.add("Статьи \uD83D\uDD16");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("Отзывы \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66");
                row.add("Медиабанк \uD83C\uDFDB");
                row.add("Подписка \uD83D\uDCE9");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                message.setReplyMarkup(keyboardMarkup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            if (message_text.equals("Обучение \uD83D\uDCDA")) {
                Document doc = Jsoup.connect("https://vk.com/video/playlist/-198807732_3").get();
                // Elements extends ArrayList<Element>.

                String cssQuery = "a[href*=/video-]";
                Elements elements = doc.select(cssQuery);
                Iterator<Element> iterator = elements.iterator();
                while (iterator.hasNext()) {
                    Element xx = iterator.next();
                   ArrayList<String> list = new ArrayList<String>();
                    list.add("https://vk.com"+ xx.attr("href"));

                   Set<String> set = new LinkedHashSet<String>(list);
                 System.out.println(set);
                    SendMessage message = new SendMessage();
                    message.setChatId(String.valueOf(chat_id));
                    message.setText(String.valueOf(set));

                    ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
                    List<KeyboardRow> keyboard = new ArrayList<>();
                    KeyboardRow row = new KeyboardRow();
                    row.add("Обучение \uD83D\uDCDA");
                    row.add("Новости \uD83D\uDDD3");
                    row.add("Статьи \uD83D\uDD16");
                    keyboard.add(row);
                    row = new KeyboardRow();
                    row.add("Отзывы \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66");
                    row.add("Медиабанк \uD83C\uDFDB");
                    row.add("Подписка \uD83D\uDCE9");
                    keyboard.add(row);
                    keyboardMarkup.setKeyboard(keyboard);
                    message.setReplyMarkup(keyboardMarkup);
                    try {
                        execute(message);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }

            }
        }
    }


    @SneakyThrows
    public static void main(String[] args) {

        Main bot = new Main();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(bot);
    }



}
