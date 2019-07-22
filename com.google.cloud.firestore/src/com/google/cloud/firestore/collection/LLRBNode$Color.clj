(ns com.google.cloud.firestore.collection.LLRBNode$Color
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection LLRBNode$Color]))

(def RED
  "Enum Constant.

  type: com.google.cloud.firestore.collection.LLRBNode$Color"
  LLRBNode$Color/RED)

(def BLACK
  "Enum Constant.

  type: com.google.cloud.firestore.collection.LLRBNode$Color"
  LLRBNode$Color/BLACK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (LLRBNode.Color c : LLRBNode.Color.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.firestore.collection.LLRBNode$Color[]`"
  ([]
    (LLRBNode$Color/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.firestore.collection.LLRBNode$Color`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.firestore.collection.LLRBNode$Color [^java.lang.String name]
    (LLRBNode$Color/valueOf name)))

