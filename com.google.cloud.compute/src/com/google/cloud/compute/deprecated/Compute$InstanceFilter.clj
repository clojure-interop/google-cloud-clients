(ns com.google.cloud.compute.deprecated.Compute$InstanceFilter
  "Class for filtering instance lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$InstanceFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$InstanceField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceFilter`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceFilter [^com.google.cloud.compute.deprecated.Compute$InstanceField field ^java.lang.String value]
    (Compute$InstanceFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$InstanceField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$InstanceFilter`"
  (^com.google.cloud.compute.deprecated.Compute$InstanceFilter [^com.google.cloud.compute.deprecated.Compute$InstanceField field ^java.lang.String value]
    (Compute$InstanceFilter/notEquals field value)))

