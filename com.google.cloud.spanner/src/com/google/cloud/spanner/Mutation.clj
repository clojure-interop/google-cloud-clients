(ns com.google.cloud.spanner.Mutation
  "Represents an individual table modification to be applied to Cloud Spanner.

  The types of mutation that can be created are defined by Mutation.Op. To construct a mutation,
  use one of the builder methods. For example, to create a mutation that will insert a value of \"x\"
  into \"C1\" and a value of \"y\" into \"C2\" of table \"T\", write the following code:



      Mutation m = Mutation.newInsertBuilder(\"T\")
          .set(\"C1\").to(\"x\")
          .set(\"C2\").to(\"y\")
          .build();

  Mutations are applied to a database by performing a standalone write or buffering them as part of
  a transaction. TODO(user): Add links/code samples once the corresponding APIs are available.

  Mutation instances are immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Mutation]))

(defn *new-insert-builder
  "Returns a builder that can be used to construct an Mutation.Op.INSERT mutation against table; see the INSERT documentation for mutation semantics.

  table - `java.lang.String`

  returns: `com.google.cloud.spanner.Mutation$WriteBuilder`"
  (^com.google.cloud.spanner.Mutation$WriteBuilder [^java.lang.String table]
    (Mutation/newInsertBuilder table)))

(defn *new-update-builder
  "Returns a builder that can be used to construct an Mutation.Op.UPDATE mutation against table; see the UPDATE documentation for mutation semantics.

  table - `java.lang.String`

  returns: `com.google.cloud.spanner.Mutation$WriteBuilder`"
  (^com.google.cloud.spanner.Mutation$WriteBuilder [^java.lang.String table]
    (Mutation/newUpdateBuilder table)))

(defn *new-insert-or-update-builder
  "Returns a builder that can be used to construct an Mutation.Op.INSERT_OR_UPDATE mutation against
   table; see the INSERT_OR_UPDATE documentation for mutation semantics.

  table - `java.lang.String`

  returns: `com.google.cloud.spanner.Mutation$WriteBuilder`"
  (^com.google.cloud.spanner.Mutation$WriteBuilder [^java.lang.String table]
    (Mutation/newInsertOrUpdateBuilder table)))

(defn *new-replace-builder
  "Returns a builder that can be used to construct an Mutation.Op.REPLACE mutation against table; see the REPLACE documentation for mutation semantics.

  table - `java.lang.String`

  returns: `com.google.cloud.spanner.Mutation$WriteBuilder`"
  (^com.google.cloud.spanner.Mutation$WriteBuilder [^java.lang.String table]
    (Mutation/newReplaceBuilder table)))

(defn *delete
  "Returns a mutation that will delete the row with primary key key. Exactly equivalent to
   delete(table, KeySet.singleKey(key)).

  table - `java.lang.String`
  key - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.Mutation`"
  (^com.google.cloud.spanner.Mutation [^java.lang.String table ^com.google.cloud.spanner.Key key]
    (Mutation/delete table key)))

(defn get-values
  "For all types except Mutation.Op.DELETE, returns the values that this mutation will write. The
   number of elements returned is always the same as the number returned by getColumns(),
   and the ith value corresponds to the ith column.

  returns: `java.lang.Iterable<com.google.cloud.spanner.Value>`

  throws: java.lang.IllegalStateException - if operation() == Op.DELETE"
  (^java.lang.Iterable [^Mutation this]
    (-> this (.getValues))))

(defn get-columns
  "For all types except Mutation.Op.DELETE, returns the columns that this mutation will affect.

  returns: `java.lang.Iterable<java.lang.String>`

  throws: java.lang.IllegalStateException - if operation() == Op.DELETE"
  (^java.lang.Iterable [^Mutation this]
    (-> this (.getColumns))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Mutation this]
    (-> this (.toString))))

(defn get-key-set
  "For Mutation.Op.DELETE mutations, returns the key set that defines the rows to be deleted.

  returns: `com.google.cloud.spanner.KeySet`

  throws: java.lang.IllegalStateException - if operation() != Op.DELETE"
  (^com.google.cloud.spanner.KeySet [^Mutation this]
    (-> this (.getKeySet))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Mutation this]
    (-> this (.hashCode))))

(defn get-table
  "Returns the name of the table that this mutation will affect.

  returns: `java.lang.String`"
  (^java.lang.String [^Mutation this]
    (-> this (.getTable))))

(defn get-operation
  "Returns the type of operation that this mutation will perform.

  returns: `com.google.cloud.spanner.Mutation$Op`"
  (^com.google.cloud.spanner.Mutation$Op [^Mutation this]
    (-> this (.getOperation))))

(defn as-map
  "For all types except Mutation.Op.DELETE, constructs a map from column name to value. This is
   mainly intended as a convenience for testing; direct access via getColumns() and
   getValues() is more efficient.

  returns: `java.util.Map<java.lang.String,com.google.cloud.spanner.Value>`

  throws: java.lang.IllegalStateException - if operation() == Op.DELETE, or if any duplicate columns are present. Detection of duplicates does not consider case."
  (^java.util.Map [^Mutation this]
    (-> this (.asMap))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Mutation this ^java.lang.Object o]
    (-> this (.equals o))))

