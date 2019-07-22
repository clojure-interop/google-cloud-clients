(ns com.google.cloud.dns.Dns$ZoneField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$ZoneField]))

(def CREATION_TIME
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ZoneField"
  Dns$ZoneField/CREATION_TIME)

(def DESCRIPTION
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ZoneField"
  Dns$ZoneField/DESCRIPTION)

(def DNS_NAME
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ZoneField"
  Dns$ZoneField/DNS_NAME)

(def ZONE_ID
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ZoneField"
  Dns$ZoneField/ZONE_ID)

(def NAME
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ZoneField"
  Dns$ZoneField/NAME)

(def NAME_SERVER_SET
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ZoneField"
  Dns$ZoneField/NAME_SERVER_SET)

(def NAME_SERVERS
  "Enum Constant.

  type: com.google.cloud.dns.Dns$ZoneField"
  Dns$ZoneField/NAME_SERVERS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Dns.ZoneField c : Dns.ZoneField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.dns.Dns$ZoneField[]`"
  ([]
    (Dns$ZoneField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.dns.Dns$ZoneField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.dns.Dns$ZoneField [^java.lang.String name]
    (Dns$ZoneField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Dns$ZoneField this]
    (-> this (.getSelector))))

