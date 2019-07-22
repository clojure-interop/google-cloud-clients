(ns com.google.cloud.bigtable.data.v2.models.Filters$FamilyFilter
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Filters$FamilyFilter]))

(defn regex
  "Matches only cells from columns whose families satisfy the given RE2 regex. For technical reasons, the
   regex must not contain the `:` character, even if it is not being used as a literal. Note
   that, since column families cannot contain the new line character `\\n`, it is sufficient to
   use `.` as a full wildcard when matching column family names.

  regex - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$FamilyFilter this ^java.lang.String regex]
    (-> this (.regex regex))))

(defn exact-match
  "Matches only cells from columns whose families match the value.

  value - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.models.Filters$Filter`"
  (^com.google.cloud.bigtable.data.v2.models.Filters$Filter [^Filters$FamilyFilter this ^java.lang.String value]
    (-> this (.exactMatch value))))

