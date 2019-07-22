(ns com.google.cloud.compute.deprecated.Compute$RegionFilter
  "Class for filtering region lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$RegionFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$RegionField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$RegionFilter`"
  (^com.google.cloud.compute.deprecated.Compute$RegionFilter [^com.google.cloud.compute.deprecated.Compute$RegionField field ^java.lang.String value]
    (Compute$RegionFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$RegionField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$RegionFilter`"
  (^com.google.cloud.compute.deprecated.Compute$RegionFilter [^com.google.cloud.compute.deprecated.Compute$RegionField field ^java.lang.String value]
    (Compute$RegionFilter/notEquals field value)))

