(ns com.google.cloud.spanner.ReadContext$QueryAnalyzeMode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner ReadContext$QueryAnalyzeMode]))

(def PLAN
  "Enum Constant.

  Retrieves only the query plan information. No result data is returned.

  type: com.google.cloud.spanner.ReadContext$QueryAnalyzeMode"
  ReadContext$QueryAnalyzeMode/PLAN)

(def PROFILE
  "Enum Constant.

  Retrieves both query plan and query execution statistics along with the result data.

  type: com.google.cloud.spanner.ReadContext$QueryAnalyzeMode"
  ReadContext$QueryAnalyzeMode/PROFILE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ReadContext.QueryAnalyzeMode c : ReadContext.QueryAnalyzeMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.ReadContext$QueryAnalyzeMode[]`"
  ([]
    (ReadContext$QueryAnalyzeMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.ReadContext$QueryAnalyzeMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.ReadContext$QueryAnalyzeMode [^java.lang.String name]
    (ReadContext$QueryAnalyzeMode/valueOf name)))

