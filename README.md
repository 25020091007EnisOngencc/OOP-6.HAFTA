# 📚 Nesne Yönelimli Programlama - 6. Hafta (Chapter 13: Abstract Classes & Interfaces)

Bu depo Daniel Liang'ın *Introduction to Java Programming* kitabının **13. Bölüm (Abstract Classes & Interfaces)** uygulama sorularının çözümlerini ve UML mimari tasarımlarını içermektedir.

Tüm projeler `edu.tr.istiklal` paket yapısı kullanılarak Eclipse IDE üzerinde geliştirilmiş ve derleme hataları giderilerek test edilmiştir.

---

## 🛠 Proje Mimarısı & Kullanılan Teknolojiler

- **Dil:** Java (JDK 25 / OpenJDK)
- **IDE:** Eclipse IDE
- **Paket Yapısı:** `edu.tr.istiklal`
- **Konular:** Soyut Sınıflar (Abstract Classes), Arayüzler (Interfaces), `Comparable<T>`, `Cloneable`, Derin Kopyalama (Deep Copy), `BigInteger` ile Hassas Matematiksel Hesaplama.

---

## 📂 Hafta Kapsamındaki Uygulamalar ve Çözümler

### 🔹 `Example13_1` - GeometricObject & Triangle
- **Açıklama:** Soyut `GeometricObject` sınıfını genişleten (`extends`) 3 kenarlı `Triangle` sınıfı tasarlandı. Heron formülü ile alan ve çevre hesaplamaları yapıldı.

### 🔹 `Example13_5` - GeometricObject Karşılaştırma & Max Metodu
- **Açıklama:** `GeometricObject` sınıfı `Comparable<GeometricObject>` arayüzünü uygulayacak şekilde güncellendi. İki geometrik nesneden alanı büyük olanı döndüren statik `max()` metodu yazıldı.

### 🔹 `Example13_6` - ComparableCircle Sınıfı
- **Açıklama:** `Circle` sınıfından türeyen ve alanlarına göre daireleri karşılaştıran `ComparableCircle` sınıfı gerçeklendi.

### 🔹 `Example13_7` - Colorable Arayüzü & Square
- **Açıklama:** `howToColor()` metodunu içeren `Colorable` arayüzü tasarlandı. `Square` sınıfı bu arayüzü uygulayarak (`implements`) nesnenin renklendirilebilirliğini kontrol etti. Polimorfik nesne dizisi üzerinde `instanceof Colorable` testi uygulandı.

### 🔹 `Example13_8` - MyStack & Deep Copy (Derin Kopyalama)
- **Açıklama:** `MyStack` sınıfına `Cloneable` arayüzü uygulandı. İçerideki `ArrayList<Object>` listesinin kopyalama esnasında bağımsız kalması için `clone()` metodu üzerinde derin kopyalama (**Deep Copy**) gerçekleştirildi.

### 🔹 `Example13_9` - Circle equals & compareTo Override
- **Açıklama:** `Circle` sınıfı `GeometricObject` miras yapısıyla uyumlu hale getirildi. Yarıçapların eşitliğine göre `equals()` metodu ezildi (`@Override`).

### 🔹 `Example13_10` - Rectangle equals & compareTo Override
- **Açıklama:** `Rectangle` sınıfında alan eşitliğine dayalı `equals()` ve alan karşılaştırmasına dayalı `compareTo()` metodları yapılandırıldı.

### 🔹 `Example13_11` - Octagon (Sekizgen) Sınıfı
- **Açıklama:** Hem `Comparable` hem de `Cloneable` arayüzlerini uygulayan düzgün sekizgen sınıfı tasalandı. Sekizgenin alanı $(2 + \frac{4}{\sqrt{2}}) \times side^2$ formülü ile hesaplandı ve klonlanan nesnelerin bağımsızlığı `compareTo` ile doğrulandı.

### 🔹 `Example13_13` - Course Sınıfında Derin Kopyalama
- **Açıklama:** Öğrenci listesini barındıran `Course` sınıfının `students` String dizisi `clone()` metodu içerisinde derin kopyalamaya tabi tutularak iki kursun öğrenci listeleri birbirinden bağımsız kılındı.

### 🔹 `Example13_15` - BigInteger İle Rational (Rasyonel Sayı) Sınıfı
- **Açıklama:** Pay ve paydası `BigInteger` veri tipiyle çalışan genişletilmiş `Rational` sınıfı yazıldı. Sınıf `java.lang.Number` sınıfını türetip `Comparable<Rational>` uyguladı. Taşma (overflow) olmaksızın devasa rasyonel sayılarda toplama, çıkarma, çarpma ve bölme işlemleri yapıldı.

---
