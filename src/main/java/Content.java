import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Content {
    ОБУЧЕНИЕ(1), НОВОСТИ(2), СТАТЬИ(3), ПОДПИСКА(4);
    private final int id;
}
