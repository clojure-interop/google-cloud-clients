(ns com.google.cloud.dns.Dns$RecordSetField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$RecordSetField]))

(def DNS_RECORDS
  "Enum Constant.

  type: com.google.cloud.dns.Dns$RecordSetField"
  Dns$RecordSetField/DNS_RECORDS)

(def NAME
  "Enum Constant.

  type: com.google.cloud.dns.Dns$RecordSetField"
  Dns$RecordSetField/NAME)

(def TTL
  "Enum Constant.

  type: com.google.cloud.dns.Dns$RecordSetField"
  Dns$RecordSetField/TTL)

(def TYPE
  "Enum Constant.

  type: com.google.cloud.dns.Dns$RecordSetField"
  Dns$RecordSetField/TYPE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Dns.RecordSetField c : Dns.RecordSetField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.dns.Dns$RecordSetField[]`"
  ([]
    (Dns$RecordSetField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.dns.Dns$RecordSetField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.dns.Dns$RecordSetField [^java.lang.String name]
    (Dns$RecordSetField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Dns$RecordSetField this]
    (-> this (.getSelector))))

