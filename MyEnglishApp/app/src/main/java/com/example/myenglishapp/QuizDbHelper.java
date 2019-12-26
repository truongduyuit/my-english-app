package com.example.myenglishapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.myenglishapp.QuizContract.*;

import java.util.ArrayList;
import java.util.List;


public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Question.db";
    private static final int DATABASE_VERSION = 1;

    private static QuizDbHelper instance;

    private SQLiteDatabase db;

    private QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized QuizDbHelper getInstance(Context context) {
        if (instance == null) {
            instance = new QuizDbHelper(context.getApplicationContext());
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_CATEGORIES_TABLE = "CREATE TABLE " +
                CategoriesTable.TABLE_NAME + "( " +
                CategoriesTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CategoriesTable.COLUMN_NAME + " TEXT " +
                ")";

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT, " +
                QuestionsTable.COLUMN_CATEGORY_ID + " INTEGER, " +
                "FOREIGN KEY(" + QuestionsTable.COLUMN_CATEGORY_ID + ") REFERENCES " +
                CategoriesTable.TABLE_NAME + "(" + CategoriesTable._ID + ")" + "ON DELETE CASCADE" +
                ")";

        db.execSQL(SQL_CREATE_CATEGORIES_TABLE);
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillCategoriesTable();
       fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + CategoriesTable.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }

    private void fillCategoriesTable() {
        Category c1 = new Category("Tense");
        addCategory(c1);
        Category c2 = new Category("Word");
        addCategory(c2);
    }

    private void addCategory(Category category) {
        ContentValues cv = new ContentValues();
        cv.put(CategoriesTable.COLUMN_NAME, category.getName());
        db.insert(CategoriesTable.TABLE_NAME, null, cv);
    }


    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY, question.getDifficulty());
        cv.put(QuestionsTable.COLUMN_CATEGORY_ID, question.getCategoryID());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public List<Category> getAllCategories() {
        List<Category> categoryList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + CategoriesTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Category category = new Category();
                category.setId(c.getInt(c.getColumnIndex(CategoriesTable._ID)));
                category.setName(c.getString(c.getColumnIndex(CategoriesTable.COLUMN_NAME)));
                categoryList.add(category);
            } while (c.moveToNext());
        }

        c.close();
        return categoryList;
    }

    private void fillQuestionsTable() {
        Question q1 = new Question("I ............Louisiana state University.",
                "am attending", "attend", "was attending", 1,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q1);
        Question q2 = new Question("Columbus............America more then 400 years ago.",
                "discovered", "has discovered", "had discovered", 1,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q2);
        Question q3 = new Question("He fell down when he ............towards the church.",
                "run", "runs", "was running", 3,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q3);
        Question q4 = new Question("We ............there when our father died.",
                "still lived", "were still living", "was still living", 2,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q4);
        Question q5 = new Question("They ............pingpong when their father comes back home.",
                "will play", "would play", "will be playing", 3,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q5);
        Question q6 = new Question("By Christmas, I.............for you for 6 months.",
                "Shall have been working", "shall work", "have been working", 1,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q6);
        Question q7 = new Question("The train............half an hour.",
                "has been leaving", "left", "has left", 2,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q7);
        Question q8 = new Question("After I...............lunch, I looked for my bag.",
                "have has", "have had", "had hadg", 3,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q8);
        Question q9 = new Question("I am sorry that I can't________ your invitation.",
                "take", "accept", "agree", 2,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q9);
        Question q10 = new Question("_________what he says, he wasn't even there when the crime was committed.",
                "Following", "According to", "Hearing", 2,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q10);
        Question q11 = new Question("He gave his listeners a vivid________ of his journey through Peru.",
                "tale", "communication", "plot", 1,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q11);
        Question q12 = new Question("This ticket__________ one person to the show.",
                "accepts", "permits", "admits", 2,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q12);
        Question q13 = new Question("As we wait no longer for the delivery of your order, we have to________ it.",
                "potspone", "accept", "return", 2,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q13);
        Question q14 = new Question("He's not________ of learning German in six months.",
                "intersted", "able", "capable", 3,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q14);
        Question q15 = new Question("The book________ two weeks ago.",
                "came across", "came out", "came into", 2,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q15);
        Question q16 = new Question("Good________ sir.",
                "morning", "summer", "jacket", 1,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q16);
        Question q17 = new Question("The mausoleum is ................. by Thien Thu mountain, two towering columns and a vast expanse of water.",
                "feed", "feeding ", "fed", 3,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q17);
        Question q18 = new Question("Put plants ............... a window so that they will get enough light.",
                "near to ", "near of ", "next to ", 3,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q18);
        Question q19 = new Question("The ships had their days of …………………. in the 1840s and 1850s.",
                "glory", "glorious ", "glorify", 1,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q19);
        Question q20 = new Question("Tea loses its flavor quickly …………………… in the hold of a vessel",
                "when storing ", "when stored ", "stored ", 2,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q20);
        Question q21 = new Question("Earl was one of the first American artists …………………. landscapes.",
                "to paint", "painted", "painting ", 1,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q21);
        Question q22 = new Question("No one has been able to satisfactorily explain how or ………… The Moon sporadically sparks",
                "when", "what ", "why ", 3,
                Question.DIFFICULTY_EASY, Category.TENSE);
        addQuestion(q22);
        Question q23 = new Question("The basic fiber-optics system is called a fiberscope, ………… Consists of two bundles of fibers.",
                "which", "where", "what", 1,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q23);
        Question q24 = new Question(". ............... his highly individual conceptions of music and chaos, John Cage became a leading figure in avant-garde music.",
                "Due to", "That", "Because from ", 1,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q24);
        Question q25 = new Question("On the slope of Long's Peak in Colorado ................... the ruin of a gigantic tree.",
                "lies", "lie", "that lies ", 1,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q25);
        Question q26 = new Question("The earth spins on its axis and ................... 23 hours, 56 minutes and 4.09\n" +
                "seconds for one complete rotation. \n",
                "need", "needing ", "needs", 3,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q26);
        Question q27 = new Question("It is earth's gravity that ................... people their weight.",
                "gives", "give", "given", 1,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q27);
        Question q = new Question("A dolphin six ................... length can move as fast as most ships.",
                "foot in ", "feet in ", "foot of ", 2,
                Question.DIFFICULTY_EASY, Category.WORD);
        addQuestion(q);
        Question q28 = new Question("With new technology, cameras can take pictures of underwater valleys................... color. ",
                "for ", "in ", "within", 1,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q28);
        Question q29 = new Question(".................. actress's life is in many ways unlike that of other women.",
                "An ", "A", "As the", 1,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q29);
        Question q30 = new Question("About 20 miles from Boston, .................. a little town named Concord that has a rich history.",
                "has", "there are", "there is", 3,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q30);
        Question q31 = new Question("They share the housework …..................... between them.",
                "equally ", "equal", "and equal", 1,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q31);
        Question q32 = new Question("A well-known large natural lake is Lake Tahoe, ................. straddles the California-Nevada border.",
                "and", "which ", "since ", 2,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q32);
        Question q33 = new Question("Physical fitness exercises can cause injuries ................. the participants are not careful.",
                "that ", "to", "if", 3,
                Question.DIFFICULTY_MEDIUM, Category.WORD);
        addQuestion(q33);
        Question q34 = new Question("It is gravity ................. objects toward the earth. ",
                "pull", "that pulls ", "to pull", 2,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q34);
        Question q35 = new Question("Using a globe can be ................. it is educational. ",
                "enjoyable", "to enjoy as", "as enjoyable as", 3,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q35);
        Question q36 = new Question("Each mediocre book we read means one less great book that we would otherwise have a chance ..................",
                "to read", "read", "reading", 1,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q36);
        Question q37 = new Question("Most accidents in the home can be prevented by ................. elimination of hazards.",
                "the", "that", "there is a", 1,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q37);
        Question q38 = new Question("Because aluminum is lighter and cheaper ............., it is frequently used for high-tension power transmission.",
                "as copper", "than copper ", "for copper", 1,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q38);
        Question q39 = new Question("............. is no way to tell the exact number of heroin addicts in the United States",
                "It", "There ", "What ", 1,
                Question.DIFFICULTY_MEDIUM, Category.TENSE);
        addQuestion(q39);

    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setId(c.getInt(c.getColumnIndex(QuestionsTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                question.setCategoryID(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_CATEGORY_ID)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }

    public ArrayList<Question> getQuestions(int categoryID, String difficulty) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String selection = QuestionsTable.COLUMN_CATEGORY_ID + " = ? " +
                " AND " + QuestionsTable.COLUMN_DIFFICULTY + " = ? ";
        String[] selectionArgs = new String[]{String.valueOf(categoryID), difficulty};

        Cursor c = db.query(
                QuestionsTable.TABLE_NAME,
                null,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setId(c.getInt(c.getColumnIndex(QuestionsTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                question.setCategoryID(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_CATEGORY_ID)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
