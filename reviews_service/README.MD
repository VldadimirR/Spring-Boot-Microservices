# Review Controller API

Контроллер для управления отзывами на товары.

## Добавление отзыва

Добавляет новый отзыв на товар.

### URL

```
POST /api/reviews
```

### Request Body

Тело запроса должно содержать объект отзыва в формате JSON.

```json
{
  "id": 1,
  "productId": 123,
  "text": "Отличный товар!"
}
```

- `id` (Long, обязательное): Идентификатор отзыва.
- `productId` (Long, обязательное): Идентификатор товара, к которому относится отзыв.
- `text` (String, обязательное): Текст отзыва.

### Response

В случае успешного добавления отзыва возвращает HTTP статус 201 Created.

## Получение отзывов по идентификатору товара

Возвращает список отзывов по идентификатору товара.

### URL

```
GET /api/reviews/{productId}
```

- `productId` (Long, обязательное): Идентификатор товара.

### Response

Возвращает список отзывов в формате JSON.

```json
[
  {
    "id": 1,
    "productId": 123,
    "text": "Отличный товар!"
  },
  {
    "id": 2,
    "productId": 123,
    "text": "Не понравился товар :("
  }
]
```

Каждый отзыв содержит:
- `id` (Long): Идентификатор отзыва.
- `productId` (Long): Идентификатор товара, к которому относится отзыв.
- `text` (String): Текст отзыва.

