(ns com.google.cloud.compute.deprecated.Compute$MachineTypeFilter
  "Class for filtering machine type lists."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$MachineTypeFilter]))

(defn *equals
  "Returns an equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$MachineTypeField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeFilter`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeFilter [^com.google.cloud.compute.deprecated.Compute$MachineTypeField field ^java.lang.String value]
    (Compute$MachineTypeFilter/equals field value)))

(defn *not-equals
  "Returns a not-equals filter for the given field and string value. For string fields, value is interpreted as a regular expression using RE2 syntax. value must match the
   entire field.

  field - `com.google.cloud.compute.deprecated.Compute$MachineTypeField`
  value - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Compute$MachineTypeFilter`"
  (^com.google.cloud.compute.deprecated.Compute$MachineTypeFilter [^com.google.cloud.compute.deprecated.Compute$MachineTypeField field ^java.lang.String value]
    (Compute$MachineTypeFilter/notEquals field value)))

