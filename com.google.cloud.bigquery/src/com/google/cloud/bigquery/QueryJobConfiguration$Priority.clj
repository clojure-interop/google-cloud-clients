(ns com.google.cloud.bigquery.QueryJobConfiguration$Priority
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery QueryJobConfiguration$Priority]))

(def INTERACTIVE
  "Enum Constant.

  Query is executed as soon as possible and count towards the concurrent rate limit and the daily
   rate limit.

  type: com.google.cloud.bigquery.QueryJobConfiguration$Priority"
  QueryJobConfiguration$Priority/INTERACTIVE)

(def BATCH
  "Enum Constant.

  Query is queued and started as soon as idle resources are available, usually within a few
   minutes. If the query hasn't started within 3 hours, its priority is changed to INTERACTIVE.

  type: com.google.cloud.bigquery.QueryJobConfiguration$Priority"
  QueryJobConfiguration$Priority/BATCH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (QueryJobConfiguration.Priority c : QueryJobConfiguration.Priority.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.QueryJobConfiguration$Priority[]`"
  ([]
    (QueryJobConfiguration$Priority/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.QueryJobConfiguration$Priority`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.QueryJobConfiguration$Priority [^java.lang.String name]
    (QueryJobConfiguration$Priority/valueOf name)))

