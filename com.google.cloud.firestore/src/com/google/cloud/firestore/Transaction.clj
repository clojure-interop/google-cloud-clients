(ns com.google.cloud.firestore.Transaction
  "A Transaction is passed to a Function to provide the methods to read and write data within the
  transaction context."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore Transaction]))

(defn get
  "Reads the document referred to by the provided DocumentReference. Holds a pessimistic lock on
   the returned document.

  document-ref - `com.google.cloud.firestore.DocumentReference`

  returns: The contents of the Document at this DocumentReference. - `com.google.api.core.ApiFuture<com.google.cloud.firestore.DocumentSnapshot>`"
  (^com.google.api.core.ApiFuture [^Transaction this ^com.google.cloud.firestore.DocumentReference document-ref]
    (-> this (.get document-ref))))

(defn get-all
  "Retrieves multiple documents from Firestore, while optionally applying a field mask to reduce
   the amount of data transmitted from the backend. Holds a pessimistic lock on all returned
   documents.

  document-references - Array with Document References to fetch. - `com.google.cloud.firestore.DocumentReference[]`
  field-mask - If set, specifies the subset of fields to return. - `com.google.cloud.firestore.FieldMask`

  returns: `com.google.api.core.ApiFuture<java.util.List<com.google.cloud.firestore.DocumentSnapshot>>`"
  (^com.google.api.core.ApiFuture [^Transaction this document-references ^com.google.cloud.firestore.FieldMask field-mask]
    (-> this (.getAll document-references field-mask)))
  (^com.google.api.core.ApiFuture [^Transaction this ^com.google.cloud.firestore.DocumentReference document-references]
    (-> this (.getAll document-references))))

