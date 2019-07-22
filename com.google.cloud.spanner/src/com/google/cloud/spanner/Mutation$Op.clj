(ns com.google.cloud.spanner.Mutation$Op
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Mutation$Op]))

(def INSERT
  "Enum Constant.

  Inserts a new row in a table. If the row already exists, the write or transaction fails with
   ErrorCode.ALREADY_EXISTS. When inserting a row, all NOT NULL columns in the table
   must be given a value.

  type: com.google.cloud.spanner.Mutation$Op"
  Mutation$Op/INSERT)

(def UPDATE
  "Enum Constant.

  Updates an existing row in a table. If the row does not already exist, the transaction fails
   with error ErrorCode.NOT_FOUND.

  type: com.google.cloud.spanner.Mutation$Op"
  Mutation$Op/UPDATE)

(def INSERT_OR_UPDATE
  "Enum Constant.

  Like INSERT, except that if the row already exists, then its column values are
   overwritten with the ones provided. All NOT NUll columns in the table must be give a value
   and this holds true even when the row already exists and will actually be updated. Values for
   all NULL columns not explicitly written are preserved.

  type: com.google.cloud.spanner.Mutation$Op"
  Mutation$Op/INSERT_OR_UPDATE)

(def REPLACE
  "Enum Constant.

  Like INSERT, except that if the row already exists, it is deleted, and the column
   values provided are inserted instead. Unlike INSERT_OR_UPDATE, this means any values
   not explicitly written become NULL.

  type: com.google.cloud.spanner.Mutation$Op"
  Mutation$Op/REPLACE)

(def DELETE
  "Enum Constant.

  Deletes rows from a table. Succeeds whether or not the named rows were present.

  type: com.google.cloud.spanner.Mutation$Op"
  Mutation$Op/DELETE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Mutation.Op c : Mutation.Op.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.Mutation$Op[]`"
  ([]
    (Mutation$Op/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.Mutation$Op`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.Mutation$Op [^java.lang.String name]
    (Mutation$Op/valueOf name)))

