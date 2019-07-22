(ns com.google.cloud.firestore.DocumentChange
  "A DocumentChange represents a change to the documents matching a query. It contains the document
  affected and a the type of change that occurred (added, modifed, or removed)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore DocumentChange]))

(defn get-type
  "returns: `com.google.cloud.firestore.DocumentChange$Type`"
  (^com.google.cloud.firestore.DocumentChange$Type [^DocumentChange this]
    (-> this (.getType))))

(defn get-document
  "Returns the newly added or modified document if this DocumentChange is for an updated document.
   Returns the deleted document if this document change represents a removal.

  returns: A snapshot of the new data (for Type.ADDED or Type.MODIFIED) or the removed data (for
       Type.REMOVED). - `com.google.cloud.firestore.QueryDocumentSnapshot`"
  (^com.google.cloud.firestore.QueryDocumentSnapshot [^DocumentChange this]
    (-> this (.getDocument))))

(defn get-old-index
  "The index of the changed document in the result set immediately prior to this DocumentChange
   (i.e. supposing that all prior DocumentChange objects have been applied). Returns -1 for
   'added' events.

  returns: `int`"
  (^Integer [^DocumentChange this]
    (-> this (.getOldIndex))))

(defn get-new-index
  "The index of the changed document in the result set immediately after this DocumentChange (i.e.
   supposing that all prior DocumentChange objects and the current DocumentChange object have been
   applied). Returns -1 for 'removed' events.

  returns: `int`"
  (^Integer [^DocumentChange this]
    (-> this (.getNewIndex))))

(defn equals
  "Returns true if this DocumentChange is equal to the provided object.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this DocumentChange is equal to the provided object. - `boolean`"
  (^Boolean [^DocumentChange this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DocumentChange this]
    (-> this (.hashCode))))

