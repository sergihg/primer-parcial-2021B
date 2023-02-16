package edu.uaslp.examen;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookCollectionManager {
    private ArrayList<BookCollection> collections;
    public BookCollectionManager(){
        collections = new ArrayList();
    }
    public BookCollection createCollection(String name){
        BookCollection newCollection = new BookCollection(name);
        collections.add(newCollection);
        return newCollection;
    }
    public BookCollection getCollectionByName(String name){
        int index;
        for(index=0;index<collections.size();index++){
            if(collections.get(index).getName()==name){
                break;
            }
        }
        if(index<collections.size()) {
            return collections.get(index);
        }
        return null;
    }
    public void deleteCollectionByName(String name){
        int index;
        for(index=0;index<collections.size();index++){
            if(collections.get(index).getName()==name){
                break;
            }
        }if(index<collections.size()) {
            collections.remove(index);
        }
    }
    public void addBookToCollection(String collectionName, Book book){
        int index;
        for(index=0;index<collections.size();index++){
            if(collections.get(index).getName()==collectionName){
                break;
            }
        }
        if(index<collections.size()){
            collections.get(index).addBook(book);
        }else{
            createCollection(collectionName);
            addBookToCollection(collectionName,book);
        }
    }

    public ArrayList<String> getCollectionNames() {
        ArrayList<String> names = new ArrayList<>();
        String name;
        int index;
        for(index=0;index<collections.size();index++) {
            name = collections.get(index).getName();
            names.add(name);
        }
        return names;
    }
}
