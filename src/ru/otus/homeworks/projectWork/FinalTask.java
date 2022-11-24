package ru.otus.homeworks.projectWork;

import ru.otus.homeworks.projectWork.app.services.IOService;
import ru.otus.homeworks.projectWork.domain.currency.Currency;
import ru.otus.homeworks.projectWork.services.ConsoleIOServiceImplements;
import ru.otus.homeworks.projectWork.services.PriceIntoWords;
import ru.otus.homeworks.projectWork.services.PriceIntoWordsRunner;
import ru.otus.homeworks.projectWork.test.AllTests;

public class FinalTask {
    public static void main(String[] args) {

        AllTests.run();

        IOService ioService = new ConsoleIOServiceImplements();

        ioService.outputString("=== === === === === === === === === ===");

        ioService.outputString(PriceIntoWords.ConvertNumberLessThanOneThousand(0, Currency.RUB));
        ioService.outputString(PriceIntoWords.ConvertNumberLessThanOneThousand(10, Currency.RUB));
        ioService.outputString(PriceIntoWords.ConvertNumberLessThanOneThousand(23, Currency.RUB));
        ioService.outputString(PriceIntoWords.ConvertNumberLessThanOneThousand(451, Currency.RUB));
        ioService.outputString(PriceIntoWords.ConvertNumberLessThanOneThousand(0, Currency.JPY));
        ioService.outputString(PriceIntoWords.ConvertNumberLessThanOneThousand(10, Currency.JPY));
        ioService.outputString(PriceIntoWords.ConvertNumberLessThanOneThousand(23, Currency.JPY));
        ioService.outputString(PriceIntoWords.ConvertNumberLessThanOneThousand(451, Currency.JPY));

        ioService.outputString("=== === === === === === === === === ===");

        PriceIntoWordsRunner priceIntoWordsRunner = new PriceIntoWordsRunner(ioService);
        priceIntoWordsRunner.runConvertNumberLessThanOneThousand();
    }
}