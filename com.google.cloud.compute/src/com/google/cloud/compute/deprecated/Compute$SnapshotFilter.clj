(ns com.google.cloud.compute.deprecated.Compute$SnapshotFilter
  "Class for filtering snapshot lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$SnapshotFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$SnapshotField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$SnapshotFilter`"
  (^com.google.cloud.compute.deprecated.Compute$SnapshotFilter [^com.google.cloud.compute.deprecated.Compute$SnapshotField field ^java.lang.String value]
    (Compute$SnapshotFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$SnapshotField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$SnapshotFilter`"
  (^com.google.cloud.compute.deprecated.Compute$SnapshotFilter [^com.google.cloud.compute.deprecated.Compute$SnapshotField field ^java.lang.String value]
    (Compute$SnapshotFilter/notEquals field value)))

