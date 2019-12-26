package com.example.myenglishapp.tabGrammar;


public class DuLieu {
    public void duLieu(Database database)
    {
        try{
            database.QuerryData("DROP TABLE  nguphap");
        }
        catch (Exception e){}
        database.QuerryData("CREATE TABLE nguphap (id INT PRIMARY KEY, ten TEXT, title1 TEXT, noidung1 TEXT, title2 TEXT, noidung2 TEXT, title3 TEXT, noidung3 TEXT, title4 TEXT, noidung4 TEXT, title5 TEXT, noidung5 TEXT, title6 TEXT, noidung6 TEXT);");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (1, 'Chức năng của Danh từ trong câu', '1. (Cụm) Danh từ làm chủ ngữ trong câu', ' Vị trí: Thường sẽ đứng đầu câu, trước động từ được chia ở thì.\n" +
                "Để biết chủ ngữ ở đâu, chúng ta chỉ cần biết động từ chia thì nằm ở đâu trong câu, thì chủ ngữ sẽ nằm ở trước đó.\n" +
                "Ví dụ:\n" +
                "  ● Cats love to sit in boxes. = Mèo rất thích ngồi ở bên trong những chiếc hộp.\n" +
                "     → Động từ chia thì là love → Cats là danh từ đóng vai trò chủ ngữ của câu.\n" +
                "  ● The exhibition of Roman paintings has attracted many art students. = Buổi triễn lãm tranh La Mã thu hút rất nhiều sinh viên mỹ thuật.\n" +
                "      → Động từ chia thì là has attracted → Cụm the exhibition of Roman paintings là một cụm danh từ và là chủ ngữ của câu; trong đó, danh từ chính của cụm là chữ exhibition.\n" +
                "  ● From Monday to Friday, new episodes will be aired on the channel. = Từ thứ hai đến thứ sáu, các tập phim mới sẽ được chiếu trên kênh này.\n" +
                "     → Động từ chia thì là will be aired → Cụm new episodes là một cụm danh từ và là chủ ngữ của câu; trong đó, danh từ chính của cụm là chữ episodes. \n" +
                "     Lưu ý là: from Monday to Friday chỉ là thời gian của hành động, bổ sung ý nghĩa cho cả câu nên chúng ta không xem nó là một phần của chủ ngữ.\n" +
                "', ' 2. (Cụm) Danh từ làm tân ngữ của động từ', 'Vị trí: Thường sẽ đứng sau động từ của câu.\n" +
                "Lưu ý là có một số động từ thì bắt buộc có tân ngữ, còn có một số động từ thì không được có tân ngữ. Đây là một chủ đề khó hơn, nếu bạn muốn tìm hiểu thêm thì bạn có thể học ở bài Nội động từ & Ngoại động từ nhé!\n" +
                "Ví dụ:\n" +
                " ● I want to choose the suitable makeup products for my skin. = Tôi muốn chọn những sản phẩm trang điểm đúng phù hợp cho da của tôi.\n" +
                "     → Cụm the suitable makeup products là một cụm danh từ và là tân ngữ của động từchoose \t.\n" +
                " ● All students must sign up to get permission to attend the workshop. = Tất cả sinh viên phải đăng ký để được phép tham dự buổi hội thảo.\n" +
                "    → Cụm permission là một cụm danh từ và là tân ngữ của động từget \t\n" +
                "', ' 3. (Cụm) Danh từ làm tân ngữ của giới từ', ' Vị trí: Đứng sau giới từ.\n" +
                "Ví dụ:\n" +
                " ● My mother has just received a wedding invitation from my uncle. = Mẹ tôi mới nhận được thiệp mời đám cưới từ chú tôi.\n" +
                "→ Cụm my uncle là một cụm danh từ và là tân ngữ của giới từ from.\n" +
                " ● The famous writer wrote about his unusual childhood in his new book. = Nhà văn nổi tiếng viết về tuổi thơ bất thường của ông ấy trong quyển sách mới.\n" +
                "→ Cụm his unusual childhood là một cụm danh từ và là tân ngữ của giới từ about.\n" +
                "', ' 4. (Cụm) Danh từ làm bổ ngữ', ' Bổ nghĩa đứng sau \"to be\" và các động từ nối\n" +
                "(Cụm) danh từ làm bổ ngữ chủ ngữ khi đứng sau động từ to be hoặc động từ nối (linking verbs) như become, feel, ...\n" +
                "Trong trường hợp này, danh từ và chủ ngữ cùng chỉ một người hay một vật nên ta gọi tên bổ ngữ này là bổ ngữ chủ ngữ.\n" +
                "   ● He is a teacher. → Anh ấy là giáo viên. (teacher và he là cùng một người.)\n" +
                "   ● My house became a mess after the party. → Nhà của tôi trở thành một đống lộn xộn sau bữa tiệc. (my house và a mess cùng chỉ một vật)\n" +
                "', ' Bổ nghĩa đứng sau một số động từ khác', ' (Cụm) danh từ làm bổ ngữ tân ngữ trong cấu trúc Động Từ + Tân Ngữ + Bổ Ngữ.\n" +
                "Trong trường hợp này, danh từ và tân ngữ cùng chỉ một người hay một vật nên ta gọi là bổ ngữ tân ngữ.\n" +
                "Một số động từ thường dùng trong trường hợp này là make, call, appoint, elect, ...\n" +
                "  ● They elected him President. → Họ bầu ông ấy làm Tổng Thống. (him và President cùng chỉ một người)\n" +
                "  ● People call it a great invention. → Mọi người gọi nó là một phát mình vĩ đại. (it và a great invention cùng chỉ một vật)\n" +
                "', ' 5. Phân loại danh từ trong tiếng Anh', ' Danh từ trong tiếng Anh có thể được phân loại thành các loại là:\n" +
                "  ● Danh từ số ít & Danh từ số nhiều\n" +
                "  ● Danh từ đếm được & Danh từ không đếm được\n" +
                "');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (2, 'Vị Trí Của Danh Từ Trong Câu ', ' 1. Sau các mạo từ', ' LUÔN có 1 danh từ sau mạo từ. Các mạo từ bao gồm: a, an, the.\n" +
                "Lưu ý là danh từ này có thể không nhất thiết phải đứng ngay sau mạo từ mà có thể đứng cách đó một vài từ.\n" +
                "Ở giữa mạo từ và danh từ sẽ là tính từ để bổ nghĩa cho danh từ đó. Ví dụ:\n" +
                " • The girl was from another city. = Cô gái đó đến từ một thành phố khác.\n" +
                "→ Sau mạo từ the là danh từ girl\n" +
                "    • I met a beautiful girl at the bus stop. = Tôi gặp một cô gái xinh đẹp ở trạm xe buýt.\n" +
                "→ Sau mạo từ a là danh từ girl, ở giữa chúng là tính từ beautiful\n" +
                "I met a beautiful girl at the bus stop.\n" +
                "', '2. Sau các từ sở hữu', ' LUÔN có 1 danh từ đứng sau từ sở hữu. Các từ sở hữu bao gồm: my, your, his, her, its, our, their, dạng sở hữu cách.\n" +
                "Lưu ý là danh từ này có thể không nhất thiết phải đứng ngay sau tính từ sở hữu mà có thể đứng cách đó một vài từ.\n" +
                "Ở giữa tính từ sở hữu và danh từ sẽ là tính từ để bổ nghĩa cho danh từ đó.\n" +
                "    • The train''s departure was delayed because of the rain. = Việc khởi hành của đoàn tàu bị trì hoãn vì mưa.\n" +
                "→ Sau sở hữu cách the train''s là danh từ departure\n" +
                "    • This is my new computer. = Đây là máy tính mới của tôi.\n" +
                "→ Sau tính từ sở hữu my là danh từ computer, ở giữa chúng là tính từ new\n" +
                "This is my new computer.\n" +
                "', ' 3. Sau các từ hạn định', ' Sau các từ hạn định như this, that, these, those, each, every, both, no, some, any, few, a few, little, a little,... luôn có một danh từ. \n" +
                "Lưu ý là danh từ này có thể không cần phải đứng ngay sau từ hạn định mà có thể đứng cách đó một vài từ.\n" +
                "Ở giữa từ hạn định và danh từ sẽ là tính từ để bổ nghĩa cho danh từ đó.\n" +
                "    • It is important to do some research. = Việc làm nghiên cứu là quan trọng.\n" +
                "→ Sau từ hạn định some là danh từ research\n" +
                "    • That young woman helped me carry my bag. = Người phụ nữ trẻ đó đã giúp tôi xách túi.\n" +
                "→ Sau từ hạn định that là danh từ woman, ở giữa chúng là tính từ young\n" +
                "It is important to do some research.\n" +
                " \n" +
                "Tuy nhiên chúng ta cũng nên cẩn thận vì có những đại từ có dạng giống hệt từ hạn định, nhưng chức năng ngữ pháp thì có khác biệt.\n" +
                "Cụ thể là, sau từ hạn định thì bắt buộc phải có 1 cụm danh từ, còn đại từ thì luôn đứng một mình, không được có cụm danh từ sau đại từ:\n" +
                "    • Tính từ chỉ định: These new pencils are good. = Những cây viết chì mới này thì tốt.\n" +
                "→ Sau tính từ chỉ định these có cụm danh từ new pencils\n" +
                "    • Đại từ chỉ định: These are good. = Những cái này thì tốt.\n" +
                "→ Sau đại từ chỉ định these không có danh từ nào cả\n" +
                "', ' 4. Sau các giới từ', ' Sau các giới từ (on, at, in, under, with, of,...) là một cụm danh từ, một đại từ hoặc một động từ V-ing.\n" +
                "    • He cares about his children a lot. =  Anh ấy quan tâm đến con của mình rất nhiều.\n" +
                "→ Sau giới từ about là cụm danh từ his children\n" +
                "    • I''m really interested in visiting an art museum. → Tôi rất thích thú muốn đi thăm một viện bảo tàng.\n" +
                "→ Sau giới từ in là V-ing visiting\n" +
                "I''m really interested in visiting an art museum. \n" +
                "', ' 5. Phân loại danh từ trong tiếng Anh', ' Danh từ trong tiếng Anh có thể được phân loại thành các loại là:\n" +
                "    • Danh từ số ít & Danh từ số nhiều\n" +
                "    • Danh từ đếm được & Danh từ không đếm được\n" +
                "', ' ', ' ');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (3, ' Vị trí của Động từ trong câu (Verbs)', ' 1. Động từ là gì? (Verbs)', ' \uD83D\uDCA1 Động từ là những từ chỉ hành động (drive, run, play, ...) hoặc trạng thái (seem, feel, ...) của chủ ngữ.\n" +
                "Động từ cùng với chủ ngữ là 2 thành phần bắt buộc phải có trong một câu đơn (còn gọi là mệnh đề).\n" +
                " \n" +
                "Chúng ta có một NGUYÊN TẮC VÀNG không bao giờ sai là: \n" +
                "Mỗi câu đơn (mệnh đề) chỉ có duy nhất một động từ chia thì. Và tất cả các động từ còn lại trong câu đơn đều phải chia theo dạng.\n" +
                "', ' 2. Thì Động Từ & Dạng Động Từ (Verb Tenses & Verb Forms)', 'Chúng ta cần phân biệt giữa Thì Động Từ và Dạng Động Từ:\n" +
                "Thì động từ (Verb Tenses) cho ta biết thời gian mà hành động hoặc sự việc đó xảy ra, còn dạng động từ (Verb Forms) chỉ là các hình thức khác nhau của cùng một động từ, ngoài ra nó không biểu hiện cho chúng ta biết điều gì về thời gian cả.\n" +
                "\n" +
                "', '  3. Nguyên Tắc Vàng trong một câu tiếng Anh', ' ✅ Tóm tắt:\n" +
                "Trong một câu đơn hoặc một mệnh đề, gắn với một chủ ngữ thì phải có và chỉ có thể có một động từ chia thì, còn những động từ còn lại phải được chia ở dạng.\n" +
                "• Động từ chia ở thì (tense) sẽ đứng sau chủ ngữ và từ đó mà ta biết được thời gian xảy ra hành động đó. Động từ chia ở thì phải chia phù hợp với chủ ngữ.\n" +
                "• Động từ chia ở dạng (form) sẽ được chia dựa theo một công thức nào đó.\n" +
                " \n" +
                "Trong một câu đơn hoặc một mệnh đề, gắn với một chủ ngữ thì phải có và chỉ có thể có một động từ chia thì.\n" +
                "• The house is new. → is là động từ chia thì hiện tại đơn\n" +
                "• We have decided to get married. → have decided là động từ chia thì hiện tại hoàn thành\n" +
                "• Have you seen Nam recently? → have seen là động từ chia thì hiện tại hoàn thành\n" +
                "• No, I last saw him a year ago. → saw là động từ chia thì quá khứ đơn\n" +
                "We have decided to get married.\n" +
                "We have decided to get married.\n" +
                " \n" +
                "Một câu có thể có nhiều mệnh đề và mỗi mệnh đề có 1 chủ ngữ. Tuy nhiên, như đã đề cập ở trên, mỗi chủ ngữ cũng chỉ có một động từ chia ở thì (tense), còn những động từ còn lại phải để ở dạng (form) phù hợp.\n" +
                "• I like cake, and John likes ice cream.\n" +
                "→ 2 mệnh đề, 2 chủ ngữ, 2 động từ chia thì.\n" +
                "• John and I like music.\n" +
                "→ 1 cụm chủ ngữ, 1 động từ chia ở thì\n" +
                "• In the morning, Jimmy gets up at 6 and goes to school at 7.\n" +
                "→ 1 chủ ngữ, 2 động từ chia ở thì, nhưng thực chất là câu này là câu ghép lại với nhau Jimmy gets up at 6 and Jimmy goes to school at 7. Jimmy lặp lại nên Jimmy được gộp lại thành một.\n" +
                "• At last the guests began to arrive\n" +
                "→ 1 chủ ngữ, 1 động từ chia ở thì, 1 động từ chia ở dạng (cấu trúc: begin to do something)\n" +
                "• I look forward to hearing from you soon.\n" +
                "→ 1 chủ ngữ, 1 động từ chia ở thì, 1 động từ chia ở dạng V-ing (vì nó đứng sau giới từ to)\n" +
                "• My sister saw him standing there, crying like a baby.\n" +
                "→ 1 chủ ngữ, 1 động từ chia ở thì, 2 động từ chia ở dạng (cấu trúc: see somebody doing something)\n" +
                "John and I like music.\n" +
                " \n" +
                "Từ các ví dụ trên, ta có thể thấy:\n" +
                "• Động từ chia ở thì (tense) sẽ đứng sau chủ ngữ và từ đó mà ta biết được thời gian xảy ra hành động đó (hiện tại, quá khứ, tương lai).\n" +
                "• Động từ chia ở dạng (form)  sẽ theo một công thức nào đó. (want to do something, see somebody doing something).\n" +
                "Và đây cũng chính là cách nhận diện một động từ trong câu đang chia ở thì hay đang ở dạng.\n" +
                " \n" +
                "Lưu ý:\n" +
                "• Đối với động từ chia ở thì (tense), động từ đó phải được chia phù hợp với chủ ngữ trong câu. Chẳng hạn như chủ ngữ số ít phải dùng is hoặc thêm đuôi -s hoặc -es. Chúng ta sẽ học chi tiết về vấn đề này trong bài Sự hòa hợp giữa chủ ngữ và động từ.\n" +
                "• Đối với động từ chia ở dạng (form) thì dạng đó phải đúng với công thức được quy định bởi một từ khác trong câu. Ví dụ như sau giới từ dùng dạng V-ing ; sau tính từ dùng dạng to infinitive ; vân vân ...\n" +
                " \n" +
                "', ' 4. Ứng dụng của Nguyên Tắc Vàng', ' Nguyên Tắc Vàng sẽ giúp bạn:\n" +
                "• Viết câu đúng ngữ pháp: không chia thì cho 2 động từ trong cùng 1 câu đơn.\n" +
                "• Nhận ra các câu sai ngữ pháp\n" +
                "• Làm được các bài tập điền động từ vào chỗ trống: biết điền thì hay dạng phù hợp.\n" +
                "', ' ', ' ', ' ', ' ');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (4, ' Vị Trí và Chức Năng của Trạng Từ', ' 1. Chức năng của trạng từ là gì? (Adverbs)', ' ✅ Tóm tắt:\n" +
                "Trạng từ có các chức năng chính như sau:\n" +
                "• Bổ nghĩa cho động từ\n" +
                "• Bổ nghĩa cho tính từ\n" +
                "• Bổ nghĩa cho trạng từ khác\n" +
                "Ngoài ra, trạng từ còn có các chức năng:\n" +
                "• Bổ nghĩa cho cả câu\n" +
                "• Bổ nghĩa cho các từ loại khác: cụm danh từ, cụm giới từ, đại từ, và từ hạn định\n" +
                " \n" +
                "Trong tiếng Anh, trạng từ có khả năng bổ nghĩa cho rất nhiều từ loại khác!\n" +
                "Nó có thể được dùng để bổ nghĩa cho rất nhiều từ loại khác nhau như sau:\n" +
                " \n" +
                "Bổ nghĩa cho động từ\n" +
                "• He spoke loudly. = Anh ấy nói lớn.\n" +
                "→ Trạng từ loudly bổ nghĩa cho động từ spoke.\n" +
                "• He quickly finished his lunch. = Anh ấy nhanh chóng ăn bữa trưa.\n" +
                "→ Trạng từ quickly bổ nghĩa cho động từ finshed.\n" +
                "• He had quickly eaten the pizza before I noticed. = Anh ấy đã nhanh chóng ăn cái bánh pizza trước khi tôi để ý thấy.\n" +
                "→ Trạng từ quickly bổ nghĩa cho động từ had eaten.\n" +
                "He spoke loudly.\n" +
                " \n" +
                "Bổ nghĩa cho tính từ\n" +
                "• It was an extremely bad match. = Đó là một trận đấu cực kỳ tệ hại.\n" +
                "→ Trạng từ extremely bổ nghĩa cho tính từ bad.\n" +
                "• It''s a reasonably cheap restaurant, and the food was extremely good. = Đó là một nhà hàng khá là rẻ và thức ăn thì cực kỳ ngon.\n" +
                "→ Trạng từ reasonably bổ nghĩa cho tính từ cheap và trạng từ extremely bổ nghĩa cho tính từ good.\n" +
                "It''s a reasonably cheap restaurant, and the food was extremely good.\n" +
                " \n" +
                "Bổ nghĩa cho trạng từ khác\n" +
                "• The handball team played extremely badly last Wednesday. = Đội bóng ném chơi cực kỳ tệ vào thứ 4 vừa qua.\n" +
                "→ Trạng từ extremely bổ nghĩa cho trạng từ badly và trạng từ badly bổ nghĩa cho động từ played.\n" +
                "• He did the work completely well. = Anh ta làm công việc hoàn toàn tốt.\n" +
                "→ Trạng từ completely bổ nghĩa cho trạng từ well và trạng từ well bổ nghĩa cho động từ did.\n" +
                "He did the work completely well.\n" +
                " \n" +
                "Bổ nghĩa cho cả câu\n" +
                "Trong trường hợp bổ nghĩa cho cả câu thì trạng từ thường thuộc loại trạng từ đánh giá hay đưa ra quan điểm của người nói.\n" +
                "• Unfortunately, we could not see the Eiffel Tower. = Thật không may, chúng ta không thể đi xem tháp Eiffel.\n" +
                "• They missed the bus, apparently. = Có vẻ là họ bị lỡ chuyến xe buýt.\n" +
                "• This must, frankly, be the craziest idea anyone has ever had. = Thẳng thắn mà nói, đây là ý kiến điên rồ nhất mà ai đó đã từng nghĩ ra.\n" +
                "• Personally, I’d rather not go out tonight. = Cá nhân tôi thì không thích ra ngoài tối nay.\n" +
                "They missed the bus, apparently. \n" +
                " \n" +
                "Bổ nghĩa cho một số từ loại khác\n" +
                "Trạng từ cũng đôi khi dùng để bổ nghĩa cho một số tứ loại khác như cụm danh từ, cụm giới từ. đại từ, từ hạn định.\n" +
                "• Even camels need to drink. = Ngay cả lạc đà cũng phải uống nước.\n" +
                "→ Trạng từ even bổ nghĩa cho cụm danh từ camels. Trong trường hợp này, cụm danh từ chỉ bao gồm danh từ camels.\n" +
                "• I bought only the fruit. = Tôi chỉ mua trái cây thôi.\n" +
                "→ Trạng từ only bổ nghĩa cho cụm danh từ the fruit. Trong trường hợp này, cụm danh từ bao gồm danh từ fruit và từ hạn định the.\n" +
                "• The amusement park opens only in the summer. = Công viên giải trí mở cửa chỉ trong mùa hè.\n" +
                "→ Trạng từ only bổ nghĩa cho cụm giới từ in the summer\n" +
                "• You can''t blame anyone else; you alone made the decision. = Bạn không thể trách ai được; bạn đã tự đưa ra quyết định đó mà.\n" +
                "→ Trạng từ alone bổ nghĩa cho đại từ you\n" +
                "• He lost almost all his money. = Anh ấy làm mất gần hết tiền của mình.\n" +
                "→ Trạng từ almost bổ nghĩa cho từ hạn định all\n" +
                " \n" +
                "⚠️ Chú ý\n" +
                "Trạng từ nói chung có nhiều chức năng như vậy, nhưng chúng ta cũng cần lưu ý là không phải bất kỳ trạng từ nào cũng có thể thực hiện đầy đủ tất cả các chức năng ở trên.\n" +
                "Thông thường, mỗi trạng từ chỉ có thể thực hiện một số chức năng nhất định mà thôi. Trong quá trình học tiếng Anh, bạn sẽ dần dần học được trạng từ nào thực hiện chức năng gì.\n" +
                "', ' 2. Vị trí của trạng từ trong câu', ' ✅ Tóm tắt:\n" +
                "Đối với trường hợp bổ nghĩa cho động từ, trạng từ có thể đứng ở các vị trí sau trong câu, tùy vào trạng từ:\n" +
                "• Sau động từ\n" +
                "• Trước động từ\n" +
                "• Trước chủ ngữ\n" +
                "Còn trạng từ bổ nghĩa cho các từ loại còn lại:\n" +
                "• Thường đứng ngay trước từ mà nó bổ nghĩa\n" +
                "• Chỉ trừ một số ít trường hợp ngoại lệ\n" +
                " \n" +
                "Trường hợp trạng từ bổ nghĩa cho động từ\n" +
                "Đối với trường hợp bổ nghĩa cho động từ, trạng từ có thể đứng ở các vị trí sau trong câu, tùy vào trạng từ:\n" +
                "• Sau động từ, và nếu động từ có tân ngữ thì đứng sau tân ngữ\n" +
                "• Trước động từ, và nếu động từ có trợ động từ thì đứng giữa động từ và trợ động từ\n" +
                "• Trước chủ ngữ\n" +
                " \n" +
                "Ví dụ về vị trí \"sau động từ\":\n" +
                "• She went to the movies alone last week.\n" +
                "• They used to live there.\n" +
                "• I will go to work today.\n" +
                "• We don''t see them often.\n" +
                "Ví dụ về vị trí \"trước động từ\":\n" +
                "• I nearly fell down from the tree.\n" +
                "• He usually goes to school by bus.\n" +
                "• I simply want to make a right choice.\n" +
                "• Things are slowly getting better.\n" +
                "Chú ý: slowly đứng trước getting nhưng đứng sau trợ động từ are.\n" +
                "Ví dụ về vị trí \"trước chủ ngữ\":\n" +
                "• Yesterday, he met his long lost daughter.\n" +
                "• Sometimes, she wears the boots.\n" +
                "• Personally, I hate that color.\n" +
                "• Unfortunately, the manager was sick.\n" +
                " \n" +
                "Trường hợp trạng từ bổ nghĩa cho các từ loại khác\n" +
                "Khi trạng từ bổ nghĩa cho tính từ, trạng từ, cụm danh từ, cụm giới từ, đại từ, hay từ hạn định, thì trạng từ thường đứng trước từ mà nó bổ nghĩa.\n" +
                "• Bổ nghĩa cho tính từ:  The film was surprisingly good.\n" +
                "• Bổ nghĩa cho trạng từ:  He drives really fast.\n" +
                "• Bổ nghĩa cho cụm danh từ:  He''s just a 5-year-old boy.\n" +
                "• Bổ nghĩa cho cụm giới từ:  It''s always cold here, even in the summer.\n" +
                "• Bổ nghĩa cho đại từ:  Only you can do it.\n" +
                "• Bổ nghĩa cho từ hạn định:  He lost almost all his money.\n" +
                "Một số trường hợp ngoại lệ, trạng từ đứng phía sau:\n" +
                "• This house isn''t big enough for us.\n" +
                "• You can''t blame anyone else; you alone made the decision.\n" +
                "', ' 3. Nhận biết trạng từ trong câu', '✅ Tóm tắt:\n" +
                "Hầu hết trạng từ đều kết thúc bằng đuôi -ly. Tuy nhiên, vẫn có một số trường hợp ngoại lệ.\n" +
                "Bên cạnh đó, không phải từ nào tận cùng bằng -ly cũng là trạng từ, vì thế chúng ta nên cẩn trọng để tránh nhầm lẫn.\n" +
                " \n" +
                "Hầu hết trạng từ tận cùng bằng đuôi -ly, do chúng được tạo bằng cách gắn đuôi -ly vào sau tính từ:\n" +
                "• dangerous → dangerously\n" +
                "(nguy hiểm)\n" +
                "• careless→ carelessly\n" +
                "(không cẩn thận)\n" +
                "• nice → nicely\n" +
                "(tốt đẹp)\n" +
                "• horrible → horribly\n" +
                "(kinh khủng)\n" +
                "• easy → easily\n" +
                "(dễ dàng)\n" +
                "Dean drives carelessly. He often texts while driving.\n" +
                " \n" +
                "Tuy nhiên, vẫn có một số ngoại lệ, chẳng hạn như hình thức của tính từ và trạng từ là giống nhau, hoặc khác hẳn nhau:\n" +
                "• fast → fast\n" +
                "(nhanh)\n" +
                "• good → well\n" +
                "(tốt, ngon, giỏi, ...)\n" +
                "Đặc biệt hơn nữa, một tính từ có thể phát sinh ra cả trạng từ đuôi -ly và trạng từ bất quy tắc, với ý nghĩa của 2 trạng từ khác nhau:\n" +
                "• hard (chăm chỉ)\n" +
                "– hard (chăm chỉ)\n" +
                "– hardly (hầu như không)\n" +
                "• high (cao)\n" +
                "– high (cao - nghĩa đen)\n" +
                "– highly (cao - nghĩa bóng)\n" +
                "• late (trễ)\n" +
                "– late (trễ)\n" +
                "– lately (gần đây)\n" +
                "Bên cạnh đó, không phải từ nào tận cùng bằng -ly cũng là trạng từ, vì thế chúng ta nên cẩn trọng:\n" +
                "• Tính từ tận cùng là -ly: friendly, silly, lonely, ugly\n" +
                "• Danh từ tận cùng là -ly: ally, assembly, bully, melancholy\n" +
                "• Động từ tận cùng là -ly: apply, rely, supply\n" +
                " ', '  4. Dùng tính từ hay trạng từ?', ' Trong tiếng Anh, có 2 loại từ thường được dùng để bổ nghĩa cho các loại từ khác, đó chính là trạng từ và tính từ.\n" +
                "Vậy sự khác biệt giữa chúng là gì?\n" +
                "• Tính từ là để miêu tả thêm về người hoặc về vật.\n" +
                "• Trong khi đó, trạng từ miêu tả về cách thức mà ai đó làm việc gì đó.\n" +
                "Ví dụ:\n" +
                "• Tính từ: John is a careful driver. → John là một tài xế cẩn thận. → Câu này nói về John - rằng anh ấy là một tài xế cẩn thận.\n" +
                "• Trạng từ: John drives carefully.→ John lái xe cẩn thận. → Câu này nói về cách mà John lái xe - là cẩn thận, không chạy ẩu.\n" +
                "', ' ', ' ', ' ', ' ');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (5, ' Vị Trí Của Tính Từ Trong Câu (Adjectives)', ' 1. Tính từ trong tiếng Anh là gì? (Adjectives)', ' \uD83D\uDCA1 Tính từ là những từ dùng để miêu tả tính chất của con người, sự vật, sự việc,...\n" +
                "Ví dụ tính từ miêu tả con người: tall (cao), short (thấp), beautiful (đẹp), friendly (thân thiện),...\n" +
                "Ví dụ tính từ miêu tả sự vật: cheap (rẻ), expensive (đắt), good (tốt), bad (xấu), small (nhỏ), big (lớn),...\n" +
                "', ' 2. Tính từ nằm trong cụm danh từ, bổ nghĩa cho danh từ', ' ✅ Tóm tắt:\n" +
                "Trong một cụm danh từ, tính từ đứng trước để bổ nghĩa cho danh từ chính của cụm danh từ.\n" +
                "Nếu có nhiều tính từ cùng bổ nghĩa cho một danh từ, thứ tự của các tính từ đó là: \n" +
                "ý kiến → kích cỡ → phẩm chất → hình dạng → tuổi → màu sắc → xuất xứ → chất liệu → loại → mục đích\n" +
                "Trong trường hợp 2 tính từ thuộc cùng một phân loại, chúng ta nối 2 tính từ với nhau bằng từ and.\n" +
                " \n" +
                "Vị trí của tính từ trong cụm danh từ\n" +
                "\uD83D\uDCA1 Trong một cụm danh từ, tính từ đứng trước để bổ nghĩa cho danh từ chính của cụm danh từ.\n" +
                "Cụ thể hơn, trong một cụm danh từ, tính từ phải đứng sau tất cả các từ hạn định và đứng trước danh từ bổ nghĩa cho danh từ:\n" +
                "\n" +
                "Ví dụ:\n" +
                "• Today is a very special day. = Hôm nay là một ngày rất đặc biệt.\n" +
                "Tính từ special đứng sau từ hạn định a và sau trạng từ very, để bổ nghĩa cho danh từ day.\n" +
                "• Those two tall high school students play basketball every day. = Hai cậu học sinh trung học cao đó chơi bóng rổ mỗi ngày.\n" +
                "Tính từ tall đứng sau từ hạn định those và two và đứng trước danh từ high school bổ nghĩa cho danh từ students.\n" +
                "Those two tall high school students play basketball every day.\n" +
                " \n" +
                "Nhiều tính từ cùng bổ nghĩa cho một danh từ\n" +
                "Có thể có cùng lúc nhiều tính từ cùng bổ nghĩa cho một danh từ:\n" +
                "• a pretty tall thin young black-haired English woman = một người phụ nữ Anh tóc đen, gầy, cao, xinh xắn\n" +
                "• two long red plastic cooking spoons = hai cái muỗng nấu ăn bằng nhựa dài và đỏ\n" +
                "• a round Italian bread-like cake = một loại bánh Italia hình tròn giống bánh mì\n" +
                "Nếu có nhiều tính từ cùng bổ nghĩa cho một danh từ, thứ tự của các tính từ đó là:\n" +
                "Thứ tự tính từ\n" +
                "Ví dụ:\n" +
                "Nhiều tính từ cùng bổ nghĩa cho một danh từ\n" +
                " \n" +
                "Trong trường hợp 2 tính từ thuộc cùng một phân loại (ví dụ như cùng miêu tả màu sắc), chúng ta nối 2 tính từ với nhau bằng từ and:\n" +
                "• an old green and white T-shirt = một cái áo thun xanh lá và trắng cũ\n" +
                "an old green and white T-shirt \n" +
                "', ' 3. Tính từ đứng sau TO BE hoặc các động từ liên kết', ' \uD83D\uDCA1 Sau to be và các động từ liên kết (seem, look, feel, taste, remain, become, sound, vân vân...), chúng ta dùng tính từ.\n" +
                "Ví dụ:\n" +
                "• Her English is very good. = Tiếng Anh của cô ấy rất tốt.\n" +
                "• Train fares remain unchanged. = Giá vé tàu hỏa không thay đổi.\n" +
                "• She was becoming confused. = Cô ấy trở nên bối rối.\n" +
                "Her English is very good. \n" +
                "', ' 4. Tính từ bổ nghĩa cho đại từ bất định', ' \uD83D\uDCA1 Chúng ta dùng tính từ đứng sau đại từ bất định để bổ nghĩa cho đại từ bất định đó.\n" +
                "• We hope to prevent anything unpleasant from happening. → Chúng tôi mong sẽ ngăn chặn không để xảy ra bất cứ chuyện nào khó chịu.\n" +
                "• The doctor said there was nothing wrong with me. → Bác sĩ bảo không có gì bất ổn với tôi.\n" +
                "• She wanted to go somewhere nice. → Cô ấy muốn đến chỗ nào đó tốt.\n" +
                "The doctor said there was nothing wrong with me.\n" +
                "', ' 5. Các cấu trúc khác', ' Chúng ta cũng dùng tính từ trong các cấu trúc sau đây:\n" +
                "MAKE + tân ngữ + tính từ\n" +
                "• I just want to make her happy.\n" +
                "Tôi chỉ muốn làm cho cô ấy vui.\n" +
                "• That made me really sad.\n" +
                "Chuyện đó làm tôi rất buồn.\n" +
                "FIND + tân ngữ + tính từ\n" +
                "• We find the phone very easy to use.\n" +
                "Chúng tôi cảm thấy chiếc điện thoại này rất dễ sử dụng.\n" +
                "• You may find it hard to accept your illness.\n" +
                "Bạn cảm thấy cảm thấy khó chấp nhận căn bệnh của mình.', ' ', ' ');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (6, ' Chức Năng Của Từ Hạn Định Trong Tiếng Anh (Determiners)', ' 1. Từ hạn định là gì? (Determiners)', ' \uD83D\uDCA1 Từ hạn định là những từ đứng trước danh từ, bổ nghĩa cho danh từ để giới hạn và xác định danh từ.\n" +
                "Vậy \"giới hạn\" và \"xác định\" danh từ nghĩa là như thế nào? Chúng ta sẽ hiểu rõ định nghĩa của từ hạn định qua ví dụ dưới đây:\n" +
                " \n" +
                "Giả sử bạn đang nói về \"học sinh giỏi\", nhưng như vậy thì trên thế giới có hàng triệu học sinh giỏi, làm sao người nghe hiểu được bạn đang muốn nói đến học sinh giỏi nào!?\n" +
                "Vì vậy chúng ta  sẽ cần phải \"giới hạn\" và \"xác định\" phạm vi của những học sinh giỏi này lại, ví dụ như \"bốn học sinh giỏi\", \"một vài học sinh giỏi\", \"những học sinh giỏi này\", \"những học sinh giỏi của tôi\", vân vân...\n" +
                "', ' 2. Chức năng và vị trí của từ hạn định trong câu', ' Từ hạn định đóng vai trò gì trong câu?\n" +
                "\uD83D\uDCA1 Từ hạn định bổ nghĩa cho một danh từ, vì vậy từ hạn định luôn luôn nằm trong một cụm danh từ.\n" +
                "Vị trí của từ hạn định trong câu\n" +
                "Ví dụ:\n" +
                "• I have two big green apples.\n" +
                "Trong cụm danh từ two big green apples thì two là từ hạn định. Nó nằm trước tính từ big, tính từ green, và danh từ chính apples.\n" +
                "• My best friend at school helped me with my homework.\n" +
                "Trong cụm danh từ my best friend at school thì my là từ hạn định. Nó nằm trước tính từ best, danh từ chính friend, và cụm giới từ at school bổ nghĩa cho danh từ chính.\n" +
                " \n" +
                "Lưu ý về những từ hạn định và đại từ có dạng giống nhau\n" +
                "Chúng ta cũng lưu ý là trong tiếng Anh có một số từ hạn định và đại từ có dạng giống hệt nhau, ví dụ như all, many, some, this, that ...\n" +
                "Điểm khác nhau về mặt ngữ pháp của chúng là:\n" +
                "• Theo sau từ hạn định phải có một danh từ.\n" +
                "Danh từ này không nhất thiết phải ở ngay sau từ hạn định, mà có thể cách từ hạn định một vài từ, như đã minh họa trong cấu trúc của một cụm danh từ ở trên.\n" +
                "• Còn đại từ thì đứng một mình, theo sau đại từ không có danh từ.\n" +
                "Ví dụ:\n" +
                "• Many young people drink coffee every day. → many là từ hạn định, vì nó đang bổ nghĩa cho people\n" +
                "• Many drink coffee every day. → many là đại từ, vì nó đứng một mình\n" +
                "', ' 3. Quy tắc dùng từ hạn định', ' Danh từ có các loại sau:\n" +
                "• Danh từ đếm được: trong đó bao gồm:\n" +
                "  – Danh từ số ít\n" +
                "  – Danh từ số nhiều\n" +
                "• Danh từ không đếm được\n" +
                "Mỗi loại danh từ này có quy tắc về từ hạn định như sau:\n" +
                "• Danh từ đếm được:\n" +
                "  – Danh từ số ít: bắt buộc phải có ít nhất 1 từ hạn định đứng trước nó\n" +
                "  – Danh từ số nhiều: không bắt buộc phải có từ hạn định\n" +
                "• Danh từ không đếm được: không bắt buộc phải có từ hạn định\n" +
                "', ' ', ' ', ' ', ' ', ' ', ' ');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (7, 'Giới từ Đơn', '1. Giới từ chỉ thời gian', 'Ba giới từ at, in, on cùng có nghĩa là \"vào, tại\" thời điểm nào đó, nhưng tuỳ vào loại thời điểm mà chúng ta dùng at, in, on khác nhau:\n" +
                "• at dùng cho thời gian xác định (như mấy giờ, hay thời gian cụ thể như giờ trưa)\n" +
                "• in dùng cho năm, tháng, thế kỷ và một khoảng thời gian dài\n" +
                "• on dùng cho thứ và ngày\n" +
                "Ngoài ra có còn một số giới từ chỉ thời gian quan trọng khác như:\n" +
                "• before + thời điểm = trước thời điểm\n" +
                "  – before 7 PM = trước 7 giờ tối\n" +
                "• after + thời điểm = sau thời điểm\n" +
                "  – after Monday = sau Thứ Hai\n" +
                "• in + khoảng thời gian = sau khoảng thời gian\n" +
                "  – in two days = sau 2 ngày nữa\n" +
                "• khoảng thời gian + ago = khoảng thời gian trước\n" +
                "  – five years ago = 5 năm trước\n" +
                "• between + khoảng thời gian = trong khoảng thời gian\n" +
                "  – between July and December = trong khoảng thời gian từ tháng 7 đến tháng 12\n" +
                "• during + khoảng thời gian = trong suốt khoảng thời gian\n" +
                "  – during my childhood = trong suốt thời thơ ấu của tôi\n" +
                "• by + thời điểm = trước thời điểm / trễ nhất là thời điểm\n" +
                "  – by Monday = trước Thứ Hai / trễ nhất là Thứ Hai\n" +
                "• over + khoảng thời gian = trong suốt khoảng thời gian (thường là khoảng thời gian trong tương lai)\n" +
                "  – over the next three years = trong suốt 3 năm tới\n" +
                "\n" +
                "', '2. Giới từ chỉ nơi chốn', 'Ba giới từ at, in, on cùng có nghĩa là \"ở, tại\" nơi nào đó, nhưng tuỳ vào loại nơi chốn mà chúng ta dùng at, in, on khác nhau:\n" +
                "• at : ở tại, dùng cho địa chỉ / nơi chốn cụ thể\n" +
                "• on : ở trên dùng cho bề mặt\n" +
                "• in : ở trong, dùng cho một khu vực được xem là khép kín\n" +
                "\n" +
                "Ngoài ra còn có một số giới từ chỉ nơi chốn quan trọng khác là:\n" +
                "• above = ở bên trên\n" +
                "• below = ở bên dưới\n" +
                "• under = dưới\n" +
                "• behind = sau\n" +
                "• in front of = trước\n" +
                "• between = giữa\n" +
                "• next to = ngay cạnh\n" +
                "• by = bên cạnh\n" +
                "• near = gần\n" +
                "\n" +
                "', '3. Giới từ chỉ phương hướng', 'Các giới từ này gồm:\n" +
                "• from = từ\n" +
                "  – (nghĩa không gian) I''ve just received an email from my professor. = Tôi mới vừa nhận được email từ giáo sư.\n" +
                "  – (nghĩa thời gian) We''re open from 8 a.m. to 9 p.m. = Chúng tôi mở cửa từ 8 giờ sáng đến 9 giờ tối.\n" +
                "• to = đến\n" +
                "  – (nghĩa không gian) I''m going to the store. = Tôi sẽ đi đến cửa hàng.\n" +
                "  – (nghĩa thời gian) We''re open from 8 a.m. to 9 p.m. = Chúng tôi mở cửa từ 8 giờ sáng đến 9 giờ tối.\n" +
                "• through = xuyên qua, đến hết\n" +
                "  – (nghĩa không gian) The burglar got in through the window. = Tên trộm đột nhập vào qua cửa sổ.\n" +
                "  – (nghĩa thời gian) The amusement park is open from May through July. = Công viên giải trí mở cửa từ tháng 5 đến hết tháng 7.\n" +
                "• since = từ (thời điểm)\n" +
                "  – She has worked there since June. = Cô ấy đã làm việc ở đó từ tháng 6.\n" +
                "• until = cho đến (thời điểm)\n" +
                "  – She will work there until December. = Cô ấy sẽ làm việc ở đó cho đến tháng 12.\n" +
                "• into = vào trong\n" +
                "  – The cat ran into the house. = Con mèo chạy vào nhà.\n" +
                "• onto = lên trên\n" +
                "  – xShe carefully put the books onto the shelf. = Cô ấy cẩn thận đặt quyển sách lên kệ.\n" +
                "', '4. Các giới từ phổ biến khác', '• for = dành cho\n" +
                "  – This is a book for children. = Đây là một quyển sách cho trẻ em.\n" +
                "• with = với\n" +
                "  – I''m going to the movies with my friends. = Tôi sẽ đi xem phim với bạn.\n" +
                "• with = bằng (dụng cụ gì đó)\n" +
                "  – Please cut the meat with the red scissors. = Hãy cắt thịt bằng cây kéo đỏ.\n" +
                "• without = không có\n" +
                "  – I want my coffee without sugar. = Tôi muốn cà phê của tôi không có đường.\n" +
                "  – I can''t see it without glasses. = Tôi không nhìn thấy nó nếu không có kính.\n" +
                "• by = bởi, bằng (phương tiện gì đó)\n" +
                "  – He always goes to school by bus. = Anh ấy luôn đi học bằng xe buýt.\n" +
                "• about = về\n" +
                "  – This book is about the adventure of a 6-year-old boy. = Quyển sách này là về chuyến phiêu lưu của một cậu bé 6 tuổi.\n" +
                "• as = như là\n" +
                "  – They were dressed as monsters for Halloween. = Họ mặc đồ giống như quái vật vào dịp Halloween.\n" +
                "', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (8, 'Liên từ Kết hợp', '1. Liên từ kết hợp là gì? (Coordinating Conjunctions)', '• Trong tiếng Anh, có tổng cộng 7 liên từ kết hợp.\n" +
                "• Đặc điểm ghi nhớ: FANBOYS\n" +
                "F      A      N      B     O     Y     S\n" +
                "for   and   nor   but   or    yet   so\n" +
                "', '2. Chức năng và đặc điểm của liên từ kết hợp', 'Chức năng\n" +
                "Chúng ta dùng liên từ kết hợp để nối 2 thứ lại với nhau, nhưng cần lưu ý là 2 thứ được nối lại bắt buộc phải \"cùng loại\" với nhau:\n" +
                "• Nối 2 từ: 2 từ được nối với nhau phải cùng từ loại với nhau, chẳng hạn như cùng là danh từ, cùng là tính từ, cùng là trạng từ...\n" +
                "  – sugar and salt = đường và muối\n" +
                "   → cùng là danh từ\n" +
                "  – old but beautiful = cũ nhưng đẹp\n" +
                "   → cùng là tính từ\n" +
                "• Nối 2 cụm từ: 2 cụm từ được nối với nhau phải cùng từ loại với nhau, chẳng hạn như cùng là cụm danh từ, cùng là cụm giới từ...\n" +
                "  – a cat and two dogs = một con mèo và hai con chó\n" +
                "   → cùng là cụm danh từ\n" +
                "  – on the table or under the chair = ở trên bài hoặc ở dưới ghế\n" +
                "   → cùng là cụm giới từ\n" +
                "• Nối 2 mệnh đề:\n" +
                "  – You must study so you can understand the grammar. = Bạn phải học để bạn có thể hiểu ngữ pháp.\n" +
                "   → cùng là mệnh đề\n" +
                "', '', '', '', '', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (9, 'Động từ Khiếm khuyết (Modal Verbs)', '1. Động từ khiếm khuyết là gì? (Modal Verbs)', '\uD83D\uDCA1 Động từ khiếm khuyết là những động từ được dùng để bày tỏ khả năng, sự chắc chắn, nghĩa vụ, sự cho phép...\n" +
                "Động từ khiếm khuyết thông dụng trong tiếng Anh bao gồm các từ:\n" +
                "• can\n" +
                "• could\n" +
                "• may\n" +
                "• might\n" +
                "• will\n" +
                "• would\n" +
                "• must\n" +
                "• shall\n" +
                "• should\n" +
                "• ought to', '2. Đặc điểm của động từ khiếm khuyết', 'Luôn phải có một động từ nguyên mẫu theo sau\n" +
                "• He must be at home right now. = Anh ấy chắc hẳn phải đang ở nhà.\n" +
                "Động từ nguyên mẫu be theo sau động từ khiếm khuyết must\n" +
                "• She should listen to her parents'' advice. = Cô ấy nên nghe lời khuyên của bố mẹ.\n" +
                "Động từ nguyên mẫu listen theo sau động từ khiếm khuyết should\n" +
                "Không bao giờ thay đổi hình thức theo chủ ngữ\n" +
                "Các động từ bình thường phải thêm -s hay -es nếu chủ ngữ là danh từ số ít, nhưng động từ khiếm khuyết thì không thay đổi hình thức gì cả.\n" +
                "• I can run fast. = Tôi có thể chạy nhanh.\n" +
                "• She can go home now. = Cô ấy có thể về nhà bây giờ.\n" +
                "• All students can do their homework next week. = Tất cả học sinh có thể làm bài tập về nhà vào tuần sau.\n" +
                "Như ta có thể thấy ở các ví dụ trên, động từ khiếm khuyết can không thay đổi hình thức, cho dù chủ ngữ có là số ít hay số nhiều đi nữa.\n" +
                "Khi phủ định thì không cần trợ động từ mà chỉ cần thêm \"not\" trực tiếp vào phía sau\n" +
                "Ta có thể so sánh 2 ví dụ sau:\n" +
                "• He lies to his friends. → He does not lie to his friends. (mượn trợ động từ to do)\n" +
                "• He should lie to his friends. → He should not lie to his friends. (không cần trợ động từ)\n" +
                "Khi đặt câu hỏi thì không cần trợ động từ mà chỉ cần đảo động từ khiếm khuyết ra trước chủ ngữ\n" +
                "Ta có thể so sánh 2 ví dụ sau:\n" +
                "• He speaks English. → Does he speak English?\n" +
                "• He can speak English → Can he speak English?\n" +
                "Không có các dạng V-ing, V-ed, To Verb\n" +
                "Khác với những động từ bình thường, động từ khiếm khuyết chỉ có một dạng duy nhất là dạng nguyên mẫu.\n" +
                "Ví dụ: động từ khiếm khuyết must không có dạng musting, musted hay to must.', '3. Các chức năng của các động từ khiếm khuyết', 'Sau đây là các chức năng thông dụng nhất của các động từ khiếm khuyết:\n" +
                "\n" +
                "Khả năng xảy ra\n" +
                "Chúng ta dùng các động từ can, must, may, might để phỏng đoán khả năng xảy ra một việc việc nào đó.\n" +
                "Mức độ chắc chắn giảm dần: must, can, may, might.\n" +
                "• Learning English can be hard to some.\n" +
                "Việc học tiếng Anh có thể khó khăn với một số người.\n" +
                "• It''s snowing outside. It must be cold.\n" +
                "Ở ngoài đang có tuyết. Chắc hẳn là lạnh lắm.\n" +
                "\n" +
                "Khả năng, năng lực, kỹ năng\n" +
                "Chúng ta dùng các động từ can và could để nói về khả năng, năng lực.\n" +
                "Can dùng khi nói về khả năng ở hiện tại, còn could dùng khi nói về khả năng trong quá khứ.\n" +
                "• He can''t speak Korean.\n" +
                "Anh ấy không biết nói tiếng Hàn Quốc.\n" +
                "• My grandfather could swim fast when he was a young boy.\n" +
                "Ông của tôi có thể bơi nhanh lúc ông còn nhỏ.\n" +
                "\n" +
                "Nghĩa vụ, lời khuyên\n" +
                "Chúng ta dùng các động từ must, ought to, should để thể hiện ý phải làm hay nên làm cái gì đó.\n" +
                "Mức độ bắt buộc giảm dần: must, ought to, should\n" +
                "• Students must do their homework.\n" +
                "Học sinh phải làm bài tập về nhà.\n" +
                "• You should visit your parents often.\n" +
                "Bạn nên thường xuyên đến thăm cha mẹ.\n" +
                "\n" +
                "Cho phép và xin phép\n" +
                "Chúng ta dùng các động từ may, might, can, could để thể hiện sự cho phép làm việc gì đó.\n" +
                "• You may not eat or drink in the library.\n" +
                "Bạn không được ăn uống trong thư viện.\n" +
                "• Could I go home early today?\n" +
                "Hôm nay tôi có được phép về nhà sớm không?\n" +
                "\n" +
                "Yêu cầu, lời mời lịch sự\n" +
                "Chúng ta dùng các động từ can, could, will, would, shall trong các yêu cầu hay lời mời lịch sự.\n" +
                "• Could you help me with this?\n" +
                "Bạn có thể giúp tôi chuyện này được không?\n" +
                "• Would you like some coffee?\n" +
                "Bạn có muốn uống cà phê không?\n" +
                "\n" +
                "Ý muốn, lời hứa\n" +
                "Chúng ta dùng các động từ will để thể hiện ý muốn làm gì hoặc hứa làm gì.\n" +
                "• I will stay here with you.\n" +
                "Tôi sẽ ở đây với bạn.\n" +
                "\n" +
                "Thói quen\n" +
                "Chúng ta dùng các động từ will và would để nói về thói quen trong hiện tại (will) hoặc quá khứ (would).\n" +
                "• When I was little, I would play outside all day.\n" +
                "Khi tôi còn nhỏ, tôi thường hay chơi đùa ở ngoài cả ngày.\n" +
                "• Tim will always be late!\n" +
                "Tim lúc nào cũng tới trễ!', '', '', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (10, 'Thì hiện tại đơn (Present Simple)', '1. Thì hiện tại đơn được dùng để làm gì?', 'Thì hiện tại đơn được dùng để diễn tả các hành động sau:\n" +
                " • Một hành động mang tính thường xuyên, lặp đi lặp lại:\n" +
                "   – She often goes to school early. = Cô ấy thường đi học sớm.\n" +
                "   – I always brush my teeth before I go to bed. = Tôi luôn luôn đánh răng trước khi đi ngủ.\n" +
                "   – We go to the cinema once a month. = Chúng tôi đi xem phim mỗi tháng một lần.\n" +
                "   – It rains a lot here in the summer. = Ở nơi này vào mùa hè mưa rất nhiều.\n" +
                " • Một sự thật hiển nhiên:\n" +
                "   – The earth goes around the sun. = Trái đất quay xung quanh mặt trời.\n" +
                "   – Water boils at 100 degrees Celcius. = Nước sôi ở nhiệt độ 100 độ C.\n" +
                " • Một trạng thái ở hiện tại:\n" +
                "   – Tom is home. = Tom ở nhà.\n" +
                "   – Wendy is a singer. = Wendy là ca sỹ.\n" +
                " • Nghĩa tương lai: các chương trình, kế hoạch được sắp xếp sẵn, lên lịch sẵn:\n" +
                "   – The plane arrives at 18.00 tomorrow. = Máy bay sẽ đến lúc 18h ngày mai.\n" +
                "   – The film begins at 8pm. = Bộ phim sẽ bắt đầu lúc 8 giờ tối.\n" +
                "Lưu ý: Thì hiện tại đơn chỉ dùng trong các trường hợp trên.\n" +
                "Thì hiện tại đơn KHÔNG được dùng để diễn tả một hành động đang xảy ra tại thời điểm hiện tại. Chúng ta cần dùng thì hiện tại tiếp diễn để nói về những hành động như vậy.\n" +
                "', '2. Công thức thì hiện tại đơn', '• Nếu chủ ngữ ở ngôi thứ ba số nhiều, ngôi thứ nhất, ngôi thứ hai (tương ứng với they, I, we, you): dùng động từ nguyên mẫu\n" +
                "   – I always brush my teeth before I go to bed. = Tôi luôn luôn đánh răng trước khi đi ngủ.\n" +
                "   – Jane and Tom go to the cinema once a month. = Jane và Tom đi xem phim mỗi tháng một lần.\n" +
                "• Nếu chủ ngữ ở ngôi thứ ba số ít (tương ứng với he, she, it): dùng động từ thêm đuôi -s hoặc -es:\n" +
                "   – The film begins at 8pm. = Bộ phim sẽ bắt đầu lúc 8 giờ tối.\n" +
                "(begin→ begins)\n" +
                "   – My son watches football every night. = Con trai tôi xem đá bóng mỗi tối.\n" +
                "(watch → watches)\n" +
                "   – Trường hợp động từ have: She has a big house. = Cô ấy có một căn nhà lớn.\n" +
                "(have → has)\n" +
                "• Riêng với động từ to be:\n" +
                "   – Ngôi thứ nhất số ít: biến đổi thành am\n" +
                "I am a student. = Tôi là sinh viên.\n" +
                "   – Ngôi thứ ba số ít: biến đổi thành is\n" +
                "Jim is Canadian. = Jim là người Canada.\n" +
                "  – Các ngôi còn lại: biến đổi thành are\n" +
                "They are here. = Họ ở đây.\n" +
                "', '3. Dấu hiệu nhận biết thì hiện tại đơn', 'Vì hiện tại đơn thường được dùng để diễn tả các hành động xảy ra lặp đi lặp lại, nên trong câu thường có các từ chỉ hành động xảy ra thường xuyên đến mức nào:\n" +
                "• always = luôn luôn\n" +
                "• usually = thường xuyên\n" +
                "• often = thường\n" +
                "• sometimes = thỉnh thoảng\n" +
                "• every _____ \n" +
                "ví dụ: every day (mỗi ngày), every week (mỗi tuần)\n" +
                "• once a _____\n" +
                "ví dụ: once a month (mỗi tháng một lần), once a day (mỗi ngày một lần)\n" +
                "• ...\n" +
                "', '', '', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (11, 'Thì quá khứ đơn (Past Simple)', '1. Thì quá khứ đơn được dùng để làm gì?', 'Thì quá khứ đơn được dùng để diễn tả các hành động sau:\n" +
                "• Một hành động xảy ra và chấm dứt tại một thời điểm trong quá khứ:\n" +
                "  – I graduated from high school in 2010. = Tôi tốt nghiệp THPT năm 2010.\n" +
                "  – Kim lived in Japan when she was a child. = Kim sống ở Nhật lúc còn nhỏ.\n" +
                "• Một hành động lặp đi lặp lại trong quá khứ:\n" +
                "  – He often came to class late. = Anh ấy hay đến lớp trễ (trong quá khứ).\n" +
                "• Một trạng thái trong quá khứ:\n" +
                "  – The apple was on the table before. = Lúc nãy quả táo ở trên bàn.\n" +
                "  – The kids were home yesterday. = Bọn trẻ ở nhà hôm qua.\n" +
                "Lưu ý:\n" +
                "Thì quá khứ đơn thường được dịch sang tiếng Việt có từ \"đã\". Tuy nhiên, trong một số trường hợp không dịch thành \"đã\" nhưng vẫn dùng thì quá khứ đơn.\n" +
                "Ví dụ ngay ở câu trên: I graduated from high school in 2010. = Tôi tốt nghiệp THPT năm 2010.\n" +
                "Trong tiếng Việt, chúng ta không cần nói \"đã tốt nghiệp\" vì chúng ta ngầm hiểu sự việc đã xảy ra trong quá khứ, nhưng trong tiếng Anh chúng ta bắt buộc phải dùng thì quá khứ đơn \"graduated\", nếu không câu này sẽ sai ngữ pháp.\n" +
                "', '2. Công thức thì quá khứ đơn', '• Với các động từ thường: dùng động từ thêm đuôi -ed\n" +
                "  – I graduated from university in 2010. = Tôi tốt nghiệp đại học năm 2010.\n" +
                "     (graduate → graduated)\n" +
                "  – They wanted to buy a house. = Họ đã muốn mua nhà.\n" +
                "   (want → wanted)\n" +
                "• Với các động từ bất quy tắc: dùng dạng động từ V2\n" +
                "  – Sam fell from the tree and broke his leg. = Sam ngã từ trên cây và gãy chân.\n" +
                "    (fall → fell ; break → broke)\n" +
                "  – He came to class late yesterday. = Anh ấy đến lớp trễ hôm qua.\n" +
                "   (come → came)\n" +
                "• Riêng với động từ to be:\n" +
                "  – Ngôi thứ nhất số ít và ngôi thứ ba số ít: biến đổi thành was\n" +
                "    • I was very happy when I got the results. = Tôi đã rất vui khi nhận được kết quả.\n" +
                "    • The child was at his grandparent''s house. = Đứa bé đã ở nhà ông bà của nó.\n" +
                "  – Các ngôi còn lại: biến đổi thành were\n" +
                "    • The kids were home yesterday. = Bọn trẻ ở nhà hôm qua.\n" +
                "    • You were 1 year old when you walked for the first time. = Con được 1 tuổi lúc con mới biết đi.\n" +
                "', '3. Dấu hiệu nhận biết thì quá khứ đơn', 'Vì thì quá khứ đơn thường được dùng để diễn tả một hành động xảy ra và chấm dứt tại một thời điểm trong quá khứ, nên trong câu thường nhắc đến thời điểm trong quá khứ đó:\n" +
                "• yesterday = hôm qua\n" +
                "• in the past = trong quá khứ\n" +
                "• before = trước đây\n" +
                "• last ______\n" +
                "ví dụ: last week (tuần trước), last year (năm ngoái)\n" +
                "• ______ ago\n" +
                "ví dụ: two minutes ago (2 phút trước), a month ago (1 tháng trước) \n" +
                "• ...', '', '', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (12, 'Thì tương lai đơn (Future Simple)', '1. Thì tương lai đơn được dùng để làm gì?', 'Thì tương lai đơn được dùng để diễn tả các hành động sau:\n" +
                "• Một hành động được dự đoán sẽ xảy ra trong tương lai:\n" +
                "  – I think it will rain tonight. = Tôi nghĩ tối nay trời sẽ mưa.\n" +
                "  – You will be in time if you hurry. = Bạn sẽ đến kịp nếu bạn khẩn trương lên.\n" +
                "• Một quyết định được đưa ra ngay tại thời điểm nói:\n" +
                "  – I will pay  for the dinner. = Tôi sẽ trả tiền ăn tối.\n" +
                "  – I will call Jane now. = Tôi sẽ gọi cho Jane ngay.\n" +
                "• Thể hiện hứa làm gì đó, đồng ý làm gì đó, giúp đỡ người khác làm gì đó...\n" +
                "– I will check this letter for you. = Tôi sẽ kiểm tra lá thư này cho bạn.\n" +
                "– He will not lend me any money. = Anh ấy nhất định không cho tôi mượn tiền.\n" +
                "– I will not do that again. = Tôi sẽ không làm điều đó nữa.\n" +
                "', '2. Công thức thì tương lai đơn', 'will + động từ nguyên mẫu\n" +
                "• You will be in time if you hurry. = Bạn sẽ đến kịp nếu bạn khẩn trương lên.\n" +
                "• She will pay  for the dinner. = Cô ấy sẽ trả tiền ăn tối.\n" +
                "', '3\n" +
                "3. Dấu hiệu nhận biết thì tương lai đơn', 'Vì thì tương lai đơn thường dùng diễn tả một hành động được dự đoán sẽ xảy ra trong tương lai, nên trong câu sẽ có thể nhắc đến thời điểm trong tương lai đó:\n" +
                "• tomorrow = ngày mai\n" +
                "• in the future = trong tương lai\n" +
                "• later = sau này\n" +
                "• soon = sắp\n" +
                "• next ______\n" +
                "ví dụ: next week (tuần sau), next year (năm sau)\n" +
                "• in _____\n" +
                "ví dụ: in two minutes (sau 2 phút nữa), in a month (sau 1 tháng nữa) \n" +
                "• ...\n" +
                "', '', '', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (13, 'Thì hiện tại tiếp diễn (Present Continuous)', '1. Thì hiện tại tiếp diễn được dùng để làm gì?', 'Thì hiện tại tiếp diễn được dùng để diễn tả các hành động sau:\n" +
                "• Một hành động đang diễn ra ngay lúc nói hoặc đang diễn ra một cách chung chung:\n" +
                "  – Kate is reading a book in the library. = Kate đang đọc sách trong thư viện.\n" +
                "  – Jim is woking for a bank. = Jim đang làm việc cho một ngân hàng.\n" +
                "  – Your English is getting better. = Kỹ năng Tiếng Anh của bạn đang tốt lên.\n" +
                "• Nghĩa tương lai: khi đã quyết định và sắp xếp sẽ làm một việc gì đó trong tương lai:\n" +
                "  – I am leaving tomorrow. = Tôi sẽ rời đi vào ngày mai (tôi đã quyết định và sắp xếp ngày giờ để rời đi)\n" +
                "  – We are having a staff meeting next Monday. = Chúng ta sẽ có một buổi họp nhân sự sáng thứ hai tuần sau (chúng ta đã quyết định và sắp xếp buổi họp)\n" +
                "• Nghĩa phàn nàn: dùng với always để diễn đạt ý phàn nàn về một hành động thường lặp đi lặp lại:\n" +
                "  – He is always forgetting his books at home. = Anh ấy lúc nào cũng quên sách vở ở nhà.\n" +
                "  – She is always complaining. = Cô ấy lúc nào cũng than phiền hết.\n" +
                "', '2. Công thức thì hiện tại tiếp diễn', 'am/is/are + V-ing\n" +
                "• am/is/are tùy theo chủ ngữ\n" +
                "• V-ing là dạng động từ nguyên mẫu thêm đuôi -ing\n" +
                "Ví dụ:\n" +
                "• I am leaving tomorrow. = Tôi sẽ rời đi vào ngày mai.\n" +
                "(chủ ngữ là I → am ; leave → leaving)\n" +
                "• Kate is reading a book in the library. = Kate đang đọc sách trong thư viện.\n" +
                "(chủ ngữ là Kate → is ; read → reading)\n" +
                "• We are having a staff meeting next Monday. = Chúng ta sẽ có một buổi họp nhân sự sáng thứ hai tuần sau.\n" +
                "(chủ ngữ là we → are ; have → having)\n" +
                "', '', '', '', '', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (14, 'Thì quá khứ tiếp diễn (Past Continuous)', '1. Thì quá khứ tiếp diễn được dùng để làm gì?', 'Thì quá khứ tiếp diễn được dùng để diễn tả các hành động sau:\n" +
                "• Một hành động đang diễn ra tại một thời điểm trong quá khứ:\n" +
                "  – Kate was reading a book in the library at 2pm yesterday. = Kate đang đọc sách trong thư viện lúc 2 giờ chiều hôm qua.\n" +
                "  – Jim was working for a bank in June. = Jim đang làm việc cho một ngân hàng hồi tháng sáu.\n" +
                "• Một hành động đang diễn ra trong quá khứ thì có một hành động khác cắt ngang:\n" +
                "– Sam was doing his homework when we called him. = Sam đang làm bài tập về nhà lúc chúng tôi gọi cho bạn ấy.\n" +
                "    – When they arrived, I was having dinner. = Khi họ đến, tôi đang ăn tối.\n" +
                "', '2. Công thức thì quá khứ tiếp diễn', 'was/were + V-ing\n" +
                "• was/were tùy theo chủ ngữ\n" +
                "• V-ing là dạng động từ nguyên mẫu thêm đuôi -ing\n" +
                " Ví dụ:\n" +
                "• When they arrived, I was having dinner. = Khi họ đến, tôi đang ăn tối.\n" +
                "(chủ ngữ là I → was ; have → having)\n" +
                "• Jim was working for a bank in June.\n" +
                "(chủ ngữ là Jim → was ; work→ working)\n" +
                "• Some students were reading books in the library at 2pm yesterday. = Vài học sinh đang đọc sách trong thư viện lúc 2 giờ chiều hôm qua.\n" +
                "(chủ ngữ là some students → were ; read → reading)\n" +
                "', '', '', '', '', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (15, 'Thì tương lai tiếp diễn (Future Continuous)', '1. Thì tương lai tiếp diễn (Future Continuous)', 'Thì tương lai tiếp diễn được dùng để diễn tả các hành động sau:\n" +
                "• Một hành động đang diễn ra hoặc được dự đoán là đang diễn ra tại một thời điểm trong tương lai:\n" +
                "  – Kate will be reading a book in the library at 2pm tomorrow like usual. = Kate sẽ đang đọc sách trong thư viện lúc 2 giờ chiều ngày mai như mọi khi.\n" +
                "  – Jim will be working for a law firm in January. = Jim sẽ đang làm việc cho văn phòng luật vào tháng 1. (đã bắt đầu làm việc từ trước tháng 1 và trong tháng 1 vẫn đang làm việc)\n" +
                "', '2. Công thức thì tương lai tiếp diễn', 'will be + V-ing\n" +
                "• Tất cả các chủ ngữ đều dùng will be\n" +
                "• V-ing là dạng động từ nguyên mẫu thêm đuôi -ing\n" +
                "Ví dụ:\n" +
                "  • At 9am tomorrow she will be taking an exam. = Vào lúc 9 giờ sáng ngày mai cô ấy sẽ đang làm một bài kiểm tra.\n" +
                "  (take → taking)\n" +
                "  • I will be staying at the hotel until Sunday. = Tôi sẽ vẫn đang ở khách sạn đến chủ nhật.\n" +
                "  (stay → staying)', '', '', '', '', '', '', '', '');\n" +
                "INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (16, 'Thì hiện tại hoàn thành (Present Perfect)', '1. Thì hiện tại hoàn thành được dùng để làm gì?', 'Thì hiện tại hoàn thành được dùng để diễn tả các hành động sau:\n" +
                "• Một hành động đã bắt đầu tại một thời điểm trong quá khứ và kéo dài đến hiện tại:\n" +
                "  – I have studied English for eight years. = Tôi đã học tiếng Anh được 8 năm. (nghĩa là tôi bắt đầu học tiếng Anh 8 năm trước và bây giờ vẫn còn học)\n" +
                "  – They have worked really hard this week. = Tuần này họ đã làm việc rất chăm chỉ. (nghĩa là từ đầu tuần tới thời điểm hiện tại của tuần này, họ làm việc rất chăm chỉ.)\n" +
                "• Một hành động đã xảy ra tại một thời điểm không cụ thể trong quá khứ, nhưng kết quả của hành động này có ảnh hưởng đến hiện tại:\n" +
                "  – He has left for work (so you can''t see him now). = Anh ấy đã đi làm (nên bạn hiện tại không thể gặp anh ấy được)\n" +
                "  – She has lost her phone (so she can''t call anyone now). = Cô ấy làm mất điện thoại rồi (nên bây giờ không gọi cho ai được).\n" +
                "• Một hành động đã từng làm bao nhiêu lần tính đến thời điểm hiện tại:\n" +
                "  – They have seen that movie three times. = Họ đã xem bộ phim đó 3 lần. (đã từng xem 3 lần tính đến hiện tại)\n" +
                "  – That''s the most boring movie I have ever seen. = Đó là bộ phim chán nhất mà tôi từng xem. (đã từng xem 1 lần tính đến hiện tại)\n" +
                "', '2. Công thức thì hiện tại hoàn thành', 'have/has + V3\n" +
                "• have/has tùy theo chủ ngữ\n" +
                "• V3 là dạng quá khứ phân từ của động từ ', '3. Dấu hiệu nhận biết thì hiện tại hoàn thành', 'Vì hiện tại hoàn thành thường được dùng để diễn tả các hành động đã bắt đầu tại một thời điểm trong quá khứ và kéo dài đến hiện tại, nên chúng ta có thể gặp những cụm từ sau:\n" +
                "• recently / lately = gần đây\n" +
                "• until now = cho đến bây giờ\n" +
                "• for + khoảng thời gian\n" +
                "ví dụ: for two days (đã được 2 ngày), for a month (đã được 1 tháng)\n" +
                "• since + thời điểm\n" +
                "ví dụ: since March (từ tháng 3), since 2000 (từ năm 2000)\n" +
                "• ...\n" +
                "', '', '', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (17, 'Thì quá khứ hoàn thành (Past Perfect)', '1. Thì quá khứ hoàn thành được dùng để làm gì?', 'Thì quá khứ hoàn thành được dùng để diễn tả các hành động sau:\n" +
                "• Một hành động đã bắt đầu tại một thời điểm trong quá khứ và kéo dài đến một thời điểm trong quá khứ sau đó: \n" +
                "  – I had worked for the company for eight years until last month. = Tôi đã làm việc cho công ty được 8 năm tính đến tháng vừa rồi.\n" +
                "(hành động làm việc bắt đầu từ quá khứ và kéo dài đến tháng trước, một thời điểm trong quá khứ)\n" +
                "• Một hành động đã xảy ra trong quá khứ, trước một thời điểm trong quá khứ sau đó:\n" +
                "  – He had left for work before you came here. = Anh ấy đã đi làm trước khi bạn đến đây.\n" +
                "(hành động đi làm xảy ra trước thời điểm của hành động đến đây ; cả 2 đều trong quá khứ)\n" +
                "• Một hành động đã từng làm bao nhiêu lần tính đến một thời điểm trong quá khứ:\n" +
                "  – They had seen that movie three times before last night. = Trước tối hôm qua, họ đã xem bộ phim đó 3 lần. (đã từng xem 3 lần tính đến thời điểm tối hôm qua, một thời điểm trong quá khứ)\n" +
                "', '2. Công thức thì quá khứ hoàn thành', 'had + V3\n" +
                "• had dùng cho tất cả các chủ ngữ\n" +
                "• V3 là dạng quá khứ phân từ của động từ\n" +
                "', '', '', '', '', '', '', '', '');");
        database.QuerryData("INSERT INTO nguphap (id, ten, title1, noidung1, title2, noidung2, title3, noidung3, title4, noidung4, title5, noidung5, title6, noidung6) VALUES (18, 'Thì tương lai hoàn thành (Future Perfect)', '1. Thì tương lai hoàn thành được dùng để làm gì?', 'Thì tương lai hoàn thành được dùng để diễn tả các hành động sau:\n" +
                "• Một hành động bắt đầu tại một thời điểm trong quá khứ và kéo dài đến một thời điểm trong tương lai: \n" +
                "  – I will have worked for the company for eight years next month. = Tôi sẽ làm việc cho công ty được 8 năm tính đến tháng sau.\n" +
                "(hành động làm việc bắt đầu từ quá khứ và kéo dài đến tháng sau, một thời điểm trong tương lai)\n" +
                "• Một hành động xảy ra trong tương lai, trước một thời điểm trong tương lai sau đó:\n" +
                "  – He will have left for work by the time you come here. = Bạn mà tới đây thì anh ấy đã đi làm mất rồi.\n" +
                "(hành động đi làm xảy ra trước thời điểm của hành động đến đây ; cả 2 đều trong tương lai)\n" +
                "• Một hành động đã từng làm bao nhiêu lần tính đến một thời điểm trong tương lai:\n" +
                "  – They will have seen that movie three times if they see it again tonight . = Nếu tối nay mà họ xem phim đó nữa thì họ đã xem phim đó 3 lần rồi. (tính đến thời điểm tôi hôm nay, một thời điểm trong tương lai, thì đã từng xem 3 lần)\n" +
                "', '2. Công thức thì tương lai hoàn thành', 'will + have + V3\n" +
                "• will have dùng cho tất cả các chủ ngữ\n" +
                "• V3 là dạng quá khứ phân từ của động từ\n" +
                "', '3. Dấu hiệu nhận biết thì tương lai hoàn thành', '• by + thời điểm trong tương lai\n" +
                "ví dụ: I will have left the country by May. = Đến tháng 5 thì tôi đã đi nước ngoài rồi.\n" +
                "', '', '', '', '', '', '');");
    }
}

