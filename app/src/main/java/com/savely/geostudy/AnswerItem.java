package com.savely.geostudy;

/**
 * Документация к классу. AnswerItem - класс, обьекты которого хранят данные для отображения в элементах списка ответов пользователя (см. {@link AnswerListAdapter}) в игре (cм. {@link MapActivity}).
 */
public class AnswerItem {
    public String region;
    public boolean flag;

    public AnswerItem(String region, boolean flag) {
        this.region = region;
        this.flag = flag;
    }
}
