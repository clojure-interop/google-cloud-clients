(ns com.google.cloud.spanner.KeyRange
  "Represents a range of rows in a table or index.

  A range has a start key and an end key. These keys can be open or closed, indicating if the
  range includes rows with that key.

  For example, consider the following table definition:



      CREATE TABLE UserEvents (
        UserName STRING(MAX),
        EventDate STRING(10),
      ) PRIMARY KEY(UserName, EventDate);

  The following keys name rows in this table:


    Key.of(\"Bob\", \"2014-09-23\")
    Key.of(\"Alfred\", \"2015-06-12\")


  Since the UserEvents table's PRIMARY KEY clause names two columns, each UserEvents key has two elements; the first is the UserName, and the second is the EventDate.

  Key ranges with multiple components are interpreted lexicographically by component using the
  table or index key's declared sort order. For example, the following range returns all events for
  user \"Bob\" that occurred in the year 2015:



      KeyRange.closedClosed(
          Key.of(\"Bob\", \"2015-01-01\"),
          Key.of(\"Bob\", \"2015-12-31\"))

  Start and end keys can omit trailing key components. This affects the inclusion and exclusion of
  rows that exactly match the provided key components: if the key is closed, then rows that exactly
  match the provided components are included; if the key is open, then rows that exactly match are
  not included.

  For example, the following range includes all events for \"Bob\" that occurred during and after
  the year 2000:



      KeyRange.closedClosed(
          Key.of(\"Bob\", \"2000-01-01\"),
          Key.of(\"Bob\"))

  The next example retrieves all events for \"Bob\":



      KeyRange.prefix(Key.of(\"Bob\"))

  To retrieve events before the year 2000:



      KeyRange.closedOpen(
          Key.of(\"Bob\"),
          Key.of(\"Bob\", \"2000-01-01\"))

  The following range includes all rows in the table:



      KeyRange.all()

  This range returns all users whose UserName begins with any character from A to C:



      KeyRange.closedOpen(Key.of(\"A\"), Key.of(\"D\"))

  This range returns all users whose UserName begins with B:



      KeyRange.closedOpen(Key.of(\"B\"), Key.of(\"C\"))

  Key ranges honor column sort order. For example, suppose a table is defined as follows:



      CREATE TABLE DescendingSortedTable {
        Key INT64,
        ...
      ) PRIMARY KEY(Key DESC);

  The following range retrieves all rows with key values between 1 and 100 inclusive:



      KeyRange.closedClosed(Key.of(100), Key.of(1))

  Note that 100 is passed as the start, and 1 is passed as the end, because Key is a
  descending column in the schema.

  KeyRange instances are immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner KeyRange]))

(defn *closed-open
  "Returns a key range from start inclusive to end exclusive.

  start - `com.google.cloud.spanner.Key`
  end - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeyRange`"
  (^com.google.cloud.spanner.KeyRange [^com.google.cloud.spanner.Key start ^com.google.cloud.spanner.Key end]
    (KeyRange/closedOpen start end)))

(defn *closed-closed
  "Returns a key range from start inclusive to end inclusive.

  start - `com.google.cloud.spanner.Key`
  end - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeyRange`"
  (^com.google.cloud.spanner.KeyRange [^com.google.cloud.spanner.Key start ^com.google.cloud.spanner.Key end]
    (KeyRange/closedClosed start end)))

(defn *open-open
  "Returns a key range from start exclusive to end exclusive.

  start - `com.google.cloud.spanner.Key`
  end - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeyRange`"
  (^com.google.cloud.spanner.KeyRange [^com.google.cloud.spanner.Key start ^com.google.cloud.spanner.Key end]
    (KeyRange/openOpen start end)))

(defn *open-closed
  "Returns a key range from start exclusive to end inclusive.

  start - `com.google.cloud.spanner.Key`
  end - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeyRange`"
  (^com.google.cloud.spanner.KeyRange [^com.google.cloud.spanner.Key start ^com.google.cloud.spanner.Key end]
    (KeyRange/openClosed start end)))

(defn *prefix
  "Returns a key range that covers all keys where the first prefix.size() components match
   prefix exactly.

  prefix - `com.google.cloud.spanner.Key`

  returns: `com.google.cloud.spanner.KeyRange`"
  (^com.google.cloud.spanner.KeyRange [^com.google.cloud.spanner.Key prefix]
    (KeyRange/prefix prefix)))

(defn *new-builder
  "Returns a new builder for constructing a range.

  returns: `com.google.cloud.spanner.KeyRange$Builder`"
  (^com.google.cloud.spanner.KeyRange$Builder []
    (KeyRange/newBuilder )))

(defn get-start
  "Returns the start key of the range.

  returns: `com.google.cloud.spanner.Key`"
  (^com.google.cloud.spanner.Key [^KeyRange this]
    (-> this (.getStart))))

(defn get-start-type
  "Indicates whether the start key is inclusive (CLOSED) or exclusive (OPEN).

  returns: `com.google.cloud.spanner.KeyRange$Endpoint`"
  (^com.google.cloud.spanner.KeyRange$Endpoint [^KeyRange this]
    (-> this (.getStartType))))

(defn get-end
  "Returns the end key of the range.

  returns: `com.google.cloud.spanner.Key`"
  (^com.google.cloud.spanner.Key [^KeyRange this]
    (-> this (.getEnd))))

(defn ge-end-type
  "Indicates whether the end key is inclusive (CLOSED) or exclusive (OPEN).

  returns: `com.google.cloud.spanner.KeyRange$Endpoint`"
  (^com.google.cloud.spanner.KeyRange$Endpoint [^KeyRange this]
    (-> this (.geEndType))))

(defn to-builder
  "Returns a builder initialized with the value of this range.

  returns: `com.google.cloud.spanner.KeyRange$Builder`"
  (^com.google.cloud.spanner.KeyRange$Builder [^KeyRange this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^KeyRange this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^KeyRange this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^KeyRange this]
    (-> this (.hashCode))))

