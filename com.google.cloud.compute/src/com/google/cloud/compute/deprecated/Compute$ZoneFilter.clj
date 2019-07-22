(ns com.google.cloud.compute.deprecated.Compute$ZoneFilter
  "Class for filtering zone lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$ZoneFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$ZoneField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$ZoneFilter`"
  (^com.google.cloud.compute.deprecated.Compute$ZoneFilter [^com.google.cloud.compute.deprecated.Compute$ZoneField field ^java.lang.String value]
    (Compute$ZoneFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$ZoneField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$ZoneFilter`"
  (^com.google.cloud.compute.deprecated.Compute$ZoneFilter [^com.google.cloud.compute.deprecated.Compute$ZoneField field ^java.lang.String value]
    (Compute$ZoneFilter/notEquals field value)))

