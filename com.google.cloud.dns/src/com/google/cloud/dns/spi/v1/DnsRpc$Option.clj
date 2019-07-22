(ns com.google.cloud.dns.spi.v1.DnsRpc$Option
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns.spi.v1 DnsRpc$Option]))

(def FIELDS
  "Enum Constant.

  type: com.google.cloud.dns.spi.v1.DnsRpc$Option"
  DnsRpc$Option/FIELDS)

(def PAGE_SIZE
  "Enum Constant.

  type: com.google.cloud.dns.spi.v1.DnsRpc$Option"
  DnsRpc$Option/PAGE_SIZE)

(def PAGE_TOKEN
  "Enum Constant.

  type: com.google.cloud.dns.spi.v1.DnsRpc$Option"
  DnsRpc$Option/PAGE_TOKEN)

(def DNS_NAME
  "Enum Constant.

  type: com.google.cloud.dns.spi.v1.DnsRpc$Option"
  DnsRpc$Option/DNS_NAME)

(def NAME
  "Enum Constant.

  type: com.google.cloud.dns.spi.v1.DnsRpc$Option"
  DnsRpc$Option/NAME)

(def DNS_TYPE
  "Enum Constant.

  type: com.google.cloud.dns.spi.v1.DnsRpc$Option"
  DnsRpc$Option/DNS_TYPE)

(def SORTING_ORDER
  "Enum Constant.

  type: com.google.cloud.dns.spi.v1.DnsRpc$Option"
  DnsRpc$Option/SORTING_ORDER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DnsRpc.Option c : DnsRpc.Option.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.dns.spi.v1.DnsRpc$Option[]`"
  ([]
    (DnsRpc$Option/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.dns.spi.v1.DnsRpc$Option`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.dns.spi.v1.DnsRpc$Option [^java.lang.String name]
    (DnsRpc$Option/valueOf name)))

(defn value
  "returns: `java.lang.String`"
  (^java.lang.String [^DnsRpc$Option this]
    (-> this (.value))))

