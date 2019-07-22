(ns com.google.cloud.compute.deprecated.Compute$LicenseField
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Compute$LicenseField]))

(def CHARGES_USE_FEE
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$LicenseField"
  Compute$LicenseField/CHARGES_USE_FEE)

(def NAME
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$LicenseField"
  Compute$LicenseField/NAME)

(def SELF_LINK
  "Enum Constant.

  type: com.google.cloud.compute.deprecated.Compute$LicenseField"
  Compute$LicenseField/SELF_LINK)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Compute.LicenseField c : Compute.LicenseField.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.compute.deprecated.Compute$LicenseField[]`"
  ([]
    (Compute$LicenseField/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.compute.deprecated.Compute$LicenseField`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.compute.deprecated.Compute$LicenseField [^java.lang.String name]
    (Compute$LicenseField/valueOf name)))

(defn get-selector
  "Description copied from interface: FieldSelector

  returns: `java.lang.String`"
  (^java.lang.String [^Compute$LicenseField this]
    (-> this (.getSelector))))

