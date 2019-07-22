(ns com.google.cloud.spanner.TransactionManager$TransactionState
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner TransactionManager$TransactionState]))

(def STARTED
  "Enum Constant.

  type: com.google.cloud.spanner.TransactionManager$TransactionState"
  TransactionManager$TransactionState/STARTED)

(def COMMITTED
  "Enum Constant.

  type: com.google.cloud.spanner.TransactionManager$TransactionState"
  TransactionManager$TransactionState/COMMITTED)

(def COMMIT_FAILED
  "Enum Constant.

  type: com.google.cloud.spanner.TransactionManager$TransactionState"
  TransactionManager$TransactionState/COMMIT_FAILED)

(def ABORTED
  "Enum Constant.

  type: com.google.cloud.spanner.TransactionManager$TransactionState"
  TransactionManager$TransactionState/ABORTED)

(def ROLLED_BACK
  "Enum Constant.

  type: com.google.cloud.spanner.TransactionManager$TransactionState"
  TransactionManager$TransactionState/ROLLED_BACK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TransactionManager.TransactionState c : TransactionManager.TransactionState.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.TransactionManager$TransactionState[]`"
  ([]
    (TransactionManager$TransactionState/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.TransactionManager$TransactionState`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.TransactionManager$TransactionState [^java.lang.String name]
    (TransactionManager$TransactionState/valueOf name)))

