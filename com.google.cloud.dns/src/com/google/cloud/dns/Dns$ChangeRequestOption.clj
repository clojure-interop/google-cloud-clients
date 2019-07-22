(ns com.google.cloud.dns.Dns$ChangeRequestOption
  "Class for specifying change request field options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$ChangeRequestOption]))

(defn *fields
  "Returns an option to specify which fields of ChangeRequest should be returned by the
   service.

   If this option is not provided all change request fields are returned. ChangeRequestOption.fields can be used to specify only the fields of interest. The ID of the
   change request is always returned, even if not specified. Dns.ChangeRequestField provides
   a list of fields that can be used.

  fields - `com.google.cloud.dns.Dns$ChangeRequestField`

  returns: `com.google.cloud.dns.Dns$ChangeRequestOption`"
  (^com.google.cloud.dns.Dns$ChangeRequestOption [^com.google.cloud.dns.Dns$ChangeRequestField fields]
    (Dns$ChangeRequestOption/fields fields)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Dns$ChangeRequestOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Dns$ChangeRequestOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Dns$ChangeRequestOption this]
    (-> this (.toString))))

