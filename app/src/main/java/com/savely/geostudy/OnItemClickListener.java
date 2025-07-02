package com.savely.geostudy;

/**
 * Документация к интерфейсу. OnItemClickListener - интерфейс, объекты которого реализуют метод обработки кликов
 * на элменты списка карт (см. {@link MapGameAdapter}) из меню карт (cм. {@link MapMenuFragment}).
 */
interface OnItemClickListener {
    void onItemClick(int position);
}
