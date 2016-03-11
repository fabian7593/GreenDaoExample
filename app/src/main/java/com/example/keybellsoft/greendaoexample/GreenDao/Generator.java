package com.example.keybellsoft.greendaoexample.GreenDao;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by Frosquivel Developer on 10/03/2015.
 * Fabián Rosales Esquivel
 */
public class Generator {


    public static void main(String[] args) throws Exception {
        try {
            Schema schema = new Schema(1, "testDb") {
            };
            schema.enableKeepSectionsByDefault();
            CreateEntity(schema);
            new DaoGenerator().generateAll(schema, "app/src/main/java/");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void CreateEntity(Schema schema) {
        try {

            //schemaEntity
            Entity Person = schema.addEntity("Person");
            Person.addIdProperty().autoincrement();
            Person.addLongProperty("id_person").notNull();
            Person.addStringProperty("person_name");
            Person.addStringProperty("person_last_name");


            Entity Profession = schema.addEntity("Profession");
            Profession.addIdProperty().autoincrement();
            Profession.addLongProperty("id_profession").notNull();
            Profession.addStringProperty("profession_name");


            //fks
            Property professionId = Person.addLongProperty("id_profession").notNull().getProperty();
            Person.addToOne(Profession, professionId);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
