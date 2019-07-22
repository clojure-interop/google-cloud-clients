(ns com.google.cloud.firestore.DocumentChange$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore DocumentChange$Type]))

(def ADDED
  "Enum Constant.

  Indicates a new document was added to the set of documents matching the query.

  type: com.google.cloud.firestore.DocumentChange$Type"
  DocumentChange$Type/ADDED)

(def MODIFIED
  "Enum Constant.

  Indicates a document within the query was modified.

  type: com.google.cloud.firestore.DocumentChange$Type"
  DocumentChange$Type/MODIFIED)

(def REMOVED
  "Enum Constant.

  Indicates a document within the query was removed (either deleted or no longer matches the
   query.

  type: com.google.cloud.firestore.DocumentChange$Type"
  DocumentChange$Type/REMOVED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DocumentChange.Type c : DocumentChange.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.firestore.DocumentChange$Type[]`"
  ([]
    (DocumentChange$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.firestore.DocumentChange$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.firestore.DocumentChange$Type [^java.lang.String name]
    (DocumentChange$Type/valueOf name)))

