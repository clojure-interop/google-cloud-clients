(ns com.google.cloud.logging.Logging$EntryListOption
  "Class for specifying options for listing log entries."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Logging$EntryListOption]))

(defn *page-size
  "Returns an option to specify the maximum number of log entries returned per page.

  page-size - `int`

  returns: `com.google.cloud.logging.Logging$EntryListOption`"
  (^com.google.cloud.logging.Logging$EntryListOption [^Integer page-size]
    (Logging$EntryListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing log entries.

  page-token - `java.lang.String`

  returns: `com.google.cloud.logging.Logging$EntryListOption`"
  (^com.google.cloud.logging.Logging$EntryListOption [^java.lang.String page-token]
    (Logging$EntryListOption/pageToken page-token)))

(defn *sort-order
  "Returns an option to sort log entries. If not specified, log entries are sorted in ascending
   (most-recent last) order with respect to the LogEntry.getTimestamp() value.

  field - `com.google.cloud.logging.Logging$SortingField`
  order - `com.google.cloud.logging.Logging$SortingOrder`

  returns: `com.google.cloud.logging.Logging$EntryListOption`"
  (^com.google.cloud.logging.Logging$EntryListOption [^com.google.cloud.logging.Logging$SortingField field ^com.google.cloud.logging.Logging$SortingOrder order]
    (Logging$EntryListOption/sortOrder field order)))

(defn *filter
  "Returns an option to specify a filter to the log entries to be listed.

  filter - `java.lang.String`

  returns: `com.google.cloud.logging.Logging$EntryListOption`"
  (^com.google.cloud.logging.Logging$EntryListOption [^java.lang.String filter]
    (Logging$EntryListOption/filter filter)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Logging$EntryListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Logging$EntryListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Logging$EntryListOption this]
    (-> this (.toString))))

