(ns com.google.cloud.kms.v1.KeyManagementServiceClient
  "Service Description: Google Cloud Key Management Service

  Manages cryptographic keys and operations using those keys. Implements a REST model with the
  following objects:

  * [KeyRing][google.cloud.kms.v1.KeyRing] * [CryptoKey][google.cloud.kms.v1.CryptoKey]
  * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]

  If you are using manual gRPC libraries, see [Using gRPC with Cloud
  KMS](https://cloud.google.com/kms/docs/grpc).

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
    KeyRingName name = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
    KeyRing response = keyManagementServiceClient.getKeyRing(name);
  }

  Note: close() needs to be called on the keyManagementServiceClient object to clean up
  resources such as threads. In the example above, try-with-resources is used, which automatically
  calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of KeyManagementServiceSettings
  to create(). For example:

  To customize credentials:



  KeyManagementServiceSettings keyManagementServiceSettings =
      KeyManagementServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  KeyManagementServiceClient keyManagementServiceClient =
      KeyManagementServiceClient.create(keyManagementServiceSettings);

  To customize the endpoint:



  KeyManagementServiceSettings keyManagementServiceSettings =
      KeyManagementServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  KeyManagementServiceClient keyManagementServiceClient =
      KeyManagementServiceClient.create(keyManagementServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.kms.v1 KeyManagementServiceClient]))

(defn *create
  "Constructs an instance of KeyManagementServiceClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.kms.v1.KeyManagementServiceSettings`

  returns: `com.google.cloud.kms.v1.KeyManagementServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.kms.v1.KeyManagementServiceClient [^com.google.cloud.kms.v1.KeyManagementServiceSettings settings]
    (KeyManagementServiceClient/create settings))
  (^com.google.cloud.kms.v1.KeyManagementServiceClient []
    (KeyManagementServiceClient/create )))

(defn get-crypto-key-version-callable
  "Returns metadata for a given [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     GetCryptoKeyVersionRequest request = GetCryptoKeyVersionRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<CryptoKeyVersion> future = keyManagementServiceClient.getCryptoKeyVersionCallable().futureCall(request);
     // Do something
     CryptoKeyVersion response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.getCryptoKeyVersionCallable))))

(defn list-crypto-key-versions
  "Lists [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName parent = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     for (CryptoKeyVersion element : keyManagementServiceClient.listCryptoKeyVersions(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to list, in the format `projects/*/locations/*/keyRings/*/cryptoKeys/*`. - `com.google.cloud.kms.v1.CryptoKeyName`

  returns: `com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeyVersionsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeyVersionsPagedResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyName parent]
    (-> this (.listCryptoKeyVersions parent))))

(defn encrypt
  "Encrypts data, so that it can only be recovered by a call to
   [Decrypt][google.cloud.kms.v1.KeyManagementService.Decrypt]. The
   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] must be
   [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyPathName name = CryptoKeyPathName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY_PATH]\");
     ByteString plaintext = ByteString.copyFromUtf8(\"\");
     EncryptResponse response = keyManagementServiceClient.encrypt(name, plaintext);
   }

  name - Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] or [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for encryption. If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server will use its [primary version][google.cloud.kms.v1.CryptoKey.primary]. - `com.google.cloud.kms.v1.CryptoKeyPathName`
  plaintext - Required. The data to encrypt. Must be no larger than 64KiB. The maximum size depends on the key version's [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]. For [SOFTWARE][google.cloud.kms.v1.ProtectionLevel.SOFTWARE] keys, the plaintext must be no larger than 64KiB. For [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] keys, the combined length of the plaintext and additional_authenticated_data fields must be no larger than 8KiB. - `com.google.protobuf.ByteString`

  returns: `com.google.cloud.kms.v1.EncryptResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.EncryptResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyPathName name ^com.google.protobuf.ByteString plaintext]
    (-> this (.encrypt name plaintext)))
  (^com.google.cloud.kms.v1.EncryptResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.EncryptRequest request]
    (-> this (.encrypt request))))

(defn get-crypto-key
  "Returns metadata for a given [CryptoKey][google.cloud.kms.v1.CryptoKey], as well as its
   [primary][google.cloud.kms.v1.CryptoKey.primary]
   [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName name = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     CryptoKey response = keyManagementServiceClient.getCryptoKey(name);
   }

  name - The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to get. - `com.google.cloud.kms.v1.CryptoKeyName`

  returns: `com.google.cloud.kms.v1.CryptoKey`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKey [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyName name]
    (-> this (.getCryptoKey name))))

(defn update-crypto-key-callable
  "Update a [CryptoKey][google.cloud.kms.v1.CryptoKey].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKey cryptoKey = CryptoKey.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateCryptoKeyRequest request = UpdateCryptoKeyRequest.newBuilder()
       .setCryptoKey(cryptoKey)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<CryptoKey> future = keyManagementServiceClient.updateCryptoKeyCallable().futureCall(request);
     // Do something
     CryptoKey response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.UpdateCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.updateCryptoKeyCallable))))

(defn import-crypto-key-version
  "Imports a new [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] into an existing
   [CryptoKey][google.cloud.kms.v1.CryptoKey] using the wrapped key material provided in the
   request.

   The version ID will be assigned the next sequential id within the
   [CryptoKey][google.cloud.kms.v1.CryptoKey].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName parent = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = CryptoKeyVersion.CryptoKeyVersionAlgorithm.CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED;
     String importJob = \"\";
     ImportCryptoKeyVersionRequest request = ImportCryptoKeyVersionRequest.newBuilder()
       .setParent(parent.toString())
       .setAlgorithm(algorithm)
       .setImportJob(importJob)
       .build();
     CryptoKeyVersion response = keyManagementServiceClient.importCryptoKeyVersion(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest`

  returns: `com.google.cloud.kms.v1.CryptoKeyVersion`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKeyVersion [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest request]
    (-> this (.importCryptoKeyVersion request))))

(defn get-iam-policy-callable
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists
   and does not have a policy set.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     ResourceName resource = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .build();
     ApiFuture<Policy> future = keyManagementServiceClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.getIamPolicyCallable))))

(defn set-iam-policy
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyName resource = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = keyManagementServiceClient.setIamPolicy(resource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `com.google.cloud.kms.v1.KeyName`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.KeyName resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^KeyManagementServiceClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn get-crypto-key-callable
  "Returns metadata for a given [CryptoKey][google.cloud.kms.v1.CryptoKey], as well as its
   [primary][google.cloud.kms.v1.CryptoKey.primary]
   [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName name = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     GetCryptoKeyRequest request = GetCryptoKeyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<CryptoKey> future = keyManagementServiceClient.getCryptoKeyCallable().futureCall(request);
     // Do something
     CryptoKey response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.getCryptoKeyCallable))))

(defn list-key-rings
  "Lists [KeyRings][google.cloud.kms.v1.KeyRing].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     for (KeyRing element : keyManagementServiceClient.listKeyRings(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The resource name of the location associated with the [KeyRings][google.cloud.kms.v1.KeyRing], in the format `projects/*/locations/*`. - `com.google.cloud.kms.v1.LocationName`

  returns: `com.google.cloud.kms.v1.KeyManagementServiceClient$ListKeyRingsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.KeyManagementServiceClient$ListKeyRingsPagedResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.LocationName parent]
    (-> this (.listKeyRings parent))))

(defn get-settings
  "returns: `com.google.cloud.kms.v1.KeyManagementServiceSettings`"
  (^com.google.cloud.kms.v1.KeyManagementServiceSettings [^KeyManagementServiceClient this]
    (-> this (.getSettings))))

(defn create-crypto-key-version-callable
  "Create a new [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] in a
   [CryptoKey][google.cloud.kms.v1.CryptoKey].

   The server will assign the next sequential id. If unset,
   [state][google.cloud.kms.v1.CryptoKeyVersion.state] will be set to
   [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName parent = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     CryptoKeyVersion cryptoKeyVersion = CryptoKeyVersion.newBuilder().build();
     CreateCryptoKeyVersionRequest request = CreateCryptoKeyVersionRequest.newBuilder()
       .setParent(parent.toString())
       .setCryptoKeyVersion(cryptoKeyVersion)
       .build();
     ApiFuture<CryptoKeyVersion> future = keyManagementServiceClient.createCryptoKeyVersionCallable().futureCall(request);
     // Do something
     CryptoKeyVersion response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.createCryptoKeyVersionCallable))))

(defn create-key-ring-callable
  "Create a new [KeyRing][google.cloud.kms.v1.KeyRing] in a given Project and Location.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     String keyRingId = \"\";
     KeyRing keyRing = KeyRing.newBuilder().build();
     CreateKeyRingRequest request = CreateKeyRingRequest.newBuilder()
       .setParent(parent.toString())
       .setKeyRingId(keyRingId)
       .setKeyRing(keyRing)
       .build();
     ApiFuture<KeyRing> future = keyManagementServiceClient.createKeyRingCallable().futureCall(request);
     // Do something
     KeyRing response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.CreateKeyRingRequest,com.google.cloud.kms.v1.KeyRing>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.createKeyRingCallable))))

(defn asymmetric-decrypt
  "Decrypts data that was encrypted with a public key retrieved from
   [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey] corresponding to a
   [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] ASYMMETRIC_DECRYPT.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     ByteString ciphertext = ByteString.copyFromUtf8(\"\");
     AsymmetricDecryptResponse response = keyManagementServiceClient.asymmetricDecrypt(name, ciphertext);
   }

  name - Required. The resource name of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for decryption. - `com.google.cloud.kms.v1.CryptoKeyVersionName`
  ciphertext - Required. The data encrypted with the named [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s public key using OAEP. - `com.google.protobuf.ByteString`

  returns: `com.google.cloud.kms.v1.AsymmetricDecryptResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.AsymmetricDecryptResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyVersionName name ^com.google.protobuf.ByteString ciphertext]
    (-> this (.asymmetricDecrypt name ciphertext)))
  (^com.google.cloud.kms.v1.AsymmetricDecryptResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.AsymmetricDecryptRequest request]
    (-> this (.asymmetricDecrypt request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.kms.v1.stub.KeyManagementServiceStub`"
  ([^KeyManagementServiceClient this]
    (-> this (.getStub))))

(defn get-crypto-key-version
  "Returns metadata for a given [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     CryptoKeyVersion response = keyManagementServiceClient.getCryptoKeyVersion(name);
   }

  name - The [name][google.cloud.kms.v1.CryptoKeyVersion.name] of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to get. - `com.google.cloud.kms.v1.CryptoKeyVersionName`

  returns: `com.google.cloud.kms.v1.CryptoKeyVersion`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKeyVersion [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyVersionName name]
    (-> this (.getCryptoKeyVersion name))))

(defn decrypt-callable
  "Decrypts data that was protected by
   [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt]. The
   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] must be
   [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName name = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     ByteString ciphertext = ByteString.copyFromUtf8(\"\");
     DecryptRequest request = DecryptRequest.newBuilder()
       .setName(name.toString())
       .setCiphertext(ciphertext)
       .build();
     ApiFuture<DecryptResponse> future = keyManagementServiceClient.decryptCallable().futureCall(request);
     // Do something
     DecryptResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.DecryptRequest,com.google.cloud.kms.v1.DecryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.decryptCallable))))

(defn restore-crypto-key-version-callable
  "Restore a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] in the
   [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED]
   state.

   Upon restoration of the CryptoKeyVersion,
   [state][google.cloud.kms.v1.CryptoKeyVersion.state] will be set to
   [DISABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DISABLED], and
   [destroy_time][google.cloud.kms.v1.CryptoKeyVersion.destroy_time] will be cleared.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     RestoreCryptoKeyVersionRequest request = RestoreCryptoKeyVersionRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<CryptoKeyVersion> future = keyManagementServiceClient.restoreCryptoKeyVersionCallable().futureCall(request);
     // Do something
     CryptoKeyVersion response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.RestoreCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.restoreCryptoKeyVersionCallable))))

(defn update-crypto-key-version-callable
  "Update a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s metadata.

   [state][google.cloud.kms.v1.CryptoKeyVersion.state] may be changed between
   [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED] and
   [DISABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DISABLED] using this
   method. See
   [DestroyCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.DestroyCryptoKeyVersion] and
   [RestoreCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.RestoreCryptoKeyVersion] to
   move between other states.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersion cryptoKeyVersion = CryptoKeyVersion.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateCryptoKeyVersionRequest request = UpdateCryptoKeyVersionRequest.newBuilder()
       .setCryptoKeyVersion(cryptoKeyVersion)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<CryptoKeyVersion> future = keyManagementServiceClient.updateCryptoKeyVersionCallable().futureCall(request);
     // Do something
     CryptoKeyVersion response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.updateCryptoKeyVersionCallable))))

(defn get-import-job-callable
  "Returns metadata for a given [ImportJob][google.cloud.kms.v1.ImportJob].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     ImportJobName name = ImportJobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[IMPORT_JOB]\");
     GetImportJobRequest request = GetImportJobRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ImportJob> future = keyManagementServiceClient.getImportJobCallable().futureCall(request);
     // Do something
     ImportJob response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetImportJobRequest,com.google.cloud.kms.v1.ImportJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.getImportJobCallable))))

(defn destroy-crypto-key-version-callable
  "Schedule a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] for destruction.

   Upon calling this method,
   [CryptoKeyVersion.state][google.cloud.kms.v1.CryptoKeyVersion.state] will be set to
   [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED]
   and [destroy_time][google.cloud.kms.v1.CryptoKeyVersion.destroy_time] will be set to a time 24
   hours in the future, at which point the [state][google.cloud.kms.v1.CryptoKeyVersion.state]
   will be changed to
   [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED], and the key
   material will be irrevocably destroyed.

   Before the [destroy_time][google.cloud.kms.v1.CryptoKeyVersion.destroy_time] is reached,
   [RestoreCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.RestoreCryptoKeyVersion] may
   be called to reverse the process.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     DestroyCryptoKeyVersionRequest request = DestroyCryptoKeyVersionRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<CryptoKeyVersion> future = keyManagementServiceClient.destroyCryptoKeyVersionCallable().futureCall(request);
     // Do something
     CryptoKeyVersion response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.DestroyCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.destroyCryptoKeyVersionCallable))))

(defn list-crypto-key-versions-callable
  "Lists [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName parent = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     ListCryptoKeyVersionsRequest request = ListCryptoKeyVersionsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListCryptoKeyVersionsResponse response = keyManagementServiceClient.listCryptoKeyVersionsCallable().call(request);
       for (CryptoKeyVersion element : response.getCryptoKeyVersionsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,com.google.cloud.kms.v1.ListCryptoKeyVersionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.listCryptoKeyVersionsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^KeyManagementServiceClient this]
    (-> this (.isShutdown))))

(defn update-crypto-key-version
  "Update a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]'s metadata.

   [state][google.cloud.kms.v1.CryptoKeyVersion.state] may be changed between
   [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED] and
   [DISABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DISABLED] using this
   method. See
   [DestroyCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.DestroyCryptoKeyVersion] and
   [RestoreCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.RestoreCryptoKeyVersion] to
   move between other states.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersion cryptoKeyVersion = CryptoKeyVersion.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     CryptoKeyVersion response = keyManagementServiceClient.updateCryptoKeyVersion(cryptoKeyVersion, updateMask);
   }

  crypto-key-version - [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with updated values. - `com.google.cloud.kms.v1.CryptoKeyVersion`
  update-mask - Required list of fields to be updated in this request. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.kms.v1.CryptoKeyVersion`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKeyVersion [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyVersion crypto-key-version ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateCryptoKeyVersion crypto-key-version update-mask)))
  (^com.google.cloud.kms.v1.CryptoKeyVersion [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.UpdateCryptoKeyVersionRequest request]
    (-> this (.updateCryptoKeyVersion request))))

(defn create-key-ring
  "Create a new [KeyRing][google.cloud.kms.v1.KeyRing] in a given Project and Location.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     String keyRingId = \"\";
     KeyRing keyRing = KeyRing.newBuilder().build();
     KeyRing response = keyManagementServiceClient.createKeyRing(parent, keyRingId, keyRing);
   }

  parent - Required. The resource name of the location associated with the [KeyRings][google.cloud.kms.v1.KeyRing], in the format `projects/*/locations/*`. - `com.google.cloud.kms.v1.LocationName`
  key-ring-id - Required. It must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}` - `java.lang.String`
  key-ring - A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values. - `com.google.cloud.kms.v1.KeyRing`

  returns: `com.google.cloud.kms.v1.KeyRing`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.KeyRing [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.LocationName parent ^java.lang.String key-ring-id ^com.google.cloud.kms.v1.KeyRing key-ring]
    (-> this (.createKeyRing parent key-ring-id key-ring)))
  (^com.google.cloud.kms.v1.KeyRing [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CreateKeyRingRequest request]
    (-> this (.createKeyRing request))))

(defn get-key-ring
  "Returns metadata for a given [KeyRing][google.cloud.kms.v1.KeyRing].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName name = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     KeyRing response = keyManagementServiceClient.getKeyRing(name);
   }

  name - The [name][google.cloud.kms.v1.KeyRing.name] of the [KeyRing][google.cloud.kms.v1.KeyRing] to get. - `com.google.cloud.kms.v1.KeyRingName`

  returns: `com.google.cloud.kms.v1.KeyRing`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.KeyRing [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.KeyRingName name]
    (-> this (.getKeyRing name))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^KeyManagementServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn create-crypto-key
  "Create a new [CryptoKey][google.cloud.kms.v1.CryptoKey] within a
   [KeyRing][google.cloud.kms.v1.KeyRing].

   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] and
   [CryptoKey.version_template.algorithm][google.cloud.kms.v1.CryptoKeyVersionTemplate.algorithm]
   are required.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     String cryptoKeyId = \"my-app-key\";
     CryptoKey.CryptoKeyPurpose purpose = CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT;
     long seconds = 2147483647L;
     Timestamp nextRotationTime = Timestamp.newBuilder()
       .setSeconds(seconds)
       .build();
     long seconds2 = 604800L;
     Duration rotationPeriod = Duration.newBuilder()
       .setSeconds(seconds2)
       .build();
     CryptoKey cryptoKey = CryptoKey.newBuilder()
       .setPurpose(purpose)
       .setNextRotationTime(nextRotationTime)
       .setRotationPeriod(rotationPeriod)
       .build();
     CryptoKey response = keyManagementServiceClient.createCryptoKey(parent, cryptoKeyId, cryptoKey);
   }

  parent - Required. The [name][google.cloud.kms.v1.KeyRing.name] of the KeyRing associated with the [CryptoKeys][google.cloud.kms.v1.CryptoKey]. - `com.google.cloud.kms.v1.KeyRingName`
  crypto-key-id - Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}` - `java.lang.String`
  crypto-key - A [CryptoKey][google.cloud.kms.v1.CryptoKey] with initial field values. - `com.google.cloud.kms.v1.CryptoKey`

  returns: `com.google.cloud.kms.v1.CryptoKey`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKey [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.KeyRingName parent ^java.lang.String crypto-key-id ^com.google.cloud.kms.v1.CryptoKey crypto-key]
    (-> this (.createCryptoKey parent crypto-key-id crypto-key)))
  (^com.google.cloud.kms.v1.CryptoKey [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CreateCryptoKeyRequest request]
    (-> this (.createCryptoKey request))))

(defn list-crypto-keys-paged-callable
  "Lists [CryptoKeys][google.cloud.kms.v1.CryptoKey].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     ListCryptoKeysRequest request = ListCryptoKeysRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListCryptoKeysPagedResponse> future = keyManagementServiceClient.listCryptoKeysPagedCallable().futureCall(request);
     // Do something
     for (CryptoKey element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListCryptoKeysRequest,com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.listCryptoKeysPagedCallable))))

(defn restore-crypto-key-version
  "Restore a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] in the
   [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED]
   state.

   Upon restoration of the CryptoKeyVersion,
   [state][google.cloud.kms.v1.CryptoKeyVersion.state] will be set to
   [DISABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DISABLED], and
   [destroy_time][google.cloud.kms.v1.CryptoKeyVersion.destroy_time] will be cleared.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     CryptoKeyVersion response = keyManagementServiceClient.restoreCryptoKeyVersion(name);
   }

  name - The resource name of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to restore. - `com.google.cloud.kms.v1.CryptoKeyVersionName`

  returns: `com.google.cloud.kms.v1.CryptoKeyVersion`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKeyVersion [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyVersionName name]
    (-> this (.restoreCryptoKeyVersion name))))

(defn shutdown
  ""
  ([^KeyManagementServiceClient this]
    (-> this (.shutdown))))

(defn list-crypto-keys
  "Lists [CryptoKeys][google.cloud.kms.v1.CryptoKey].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     for (CryptoKey element : keyManagementServiceClient.listCryptoKeys(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The resource name of the [KeyRing][google.cloud.kms.v1.KeyRing] to list, in the format `projects/*/locations/*/keyRings/*`. - `com.google.cloud.kms.v1.KeyRingName`

  returns: `com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeysPagedResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.KeyRingName parent]
    (-> this (.listCryptoKeys parent))))

(defn update-crypto-key-primary-version-callable
  "Update the version of a [CryptoKey][google.cloud.kms.v1.CryptoKey] that will be used in
   [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt].

   Returns an error if called on an asymmetric key.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName name = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     String cryptoKeyVersionId = \"\";
     UpdateCryptoKeyPrimaryVersionRequest request = UpdateCryptoKeyPrimaryVersionRequest.newBuilder()
       .setName(name.toString())
       .setCryptoKeyVersionId(cryptoKeyVersionId)
       .build();
     ApiFuture<CryptoKey> future = keyManagementServiceClient.updateCryptoKeyPrimaryVersionCallable().futureCall(request);
     // Do something
     CryptoKey response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.updateCryptoKeyPrimaryVersionCallable))))

(defn import-crypto-key-version-callable
  "Imports a new [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] into an existing
   [CryptoKey][google.cloud.kms.v1.CryptoKey] using the wrapped key material provided in the
   request.

   The version ID will be assigned the next sequential id within the
   [CryptoKey][google.cloud.kms.v1.CryptoKey].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName parent = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     CryptoKeyVersion.CryptoKeyVersionAlgorithm algorithm = CryptoKeyVersion.CryptoKeyVersionAlgorithm.CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED;
     String importJob = \"\";
     ImportCryptoKeyVersionRequest request = ImportCryptoKeyVersionRequest.newBuilder()
       .setParent(parent.toString())
       .setAlgorithm(algorithm)
       .setImportJob(importJob)
       .build();
     ApiFuture<CryptoKeyVersion> future = keyManagementServiceClient.importCryptoKeyVersionCallable().futureCall(request);
     // Do something
     CryptoKeyVersion response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ImportCryptoKeyVersionRequest,com.google.cloud.kms.v1.CryptoKeyVersion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.importCryptoKeyVersionCallable))))

(defn asymmetric-decrypt-callable
  "Decrypts data that was encrypted with a public key retrieved from
   [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey] corresponding to a
   [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] ASYMMETRIC_DECRYPT.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     ByteString ciphertext = ByteString.copyFromUtf8(\"\");
     AsymmetricDecryptRequest request = AsymmetricDecryptRequest.newBuilder()
       .setName(name.toString())
       .setCiphertext(ciphertext)
       .build();
     ApiFuture<AsymmetricDecryptResponse> future = keyManagementServiceClient.asymmetricDecryptCallable().futureCall(request);
     // Do something
     AsymmetricDecryptResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.AsymmetricDecryptRequest,com.google.cloud.kms.v1.AsymmetricDecryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.asymmetricDecryptCallable))))

(defn list-import-jobs-callable
  "Lists [ImportJobs][google.cloud.kms.v1.ImportJob].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     ListImportJobsRequest request = ListImportJobsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListImportJobsResponse response = keyManagementServiceClient.listImportJobsCallable().call(request);
       for (ImportJob element : response.getImportJobsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListImportJobsRequest,com.google.cloud.kms.v1.ListImportJobsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.listImportJobsCallable))))

(defn list-key-rings-callable
  "Lists [KeyRings][google.cloud.kms.v1.KeyRing].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListKeyRingsRequest request = ListKeyRingsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListKeyRingsResponse response = keyManagementServiceClient.listKeyRingsCallable().call(request);
       for (KeyRing element : response.getKeyRingsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListKeyRingsRequest,com.google.cloud.kms.v1.ListKeyRingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.listKeyRingsCallable))))

(defn get-public-key
  "Returns the public key for the given [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   The [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] must be
   [ASYMMETRIC_SIGN][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ASYMMETRIC_SIGN] or
   [ASYMMETRIC_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ASYMMETRIC_DECRYPT].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     PublicKey response = keyManagementServiceClient.getPublicKey(name);
   }

  name - The [name][google.cloud.kms.v1.CryptoKeyVersion.name] of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] public key to get. - `com.google.cloud.kms.v1.CryptoKeyVersionName`

  returns: `com.google.cloud.kms.v1.PublicKey`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.PublicKey [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyVersionName name]
    (-> this (.getPublicKey name))))

(defn create-crypto-key-version
  "Create a new [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] in a
   [CryptoKey][google.cloud.kms.v1.CryptoKey].

   The server will assign the next sequential id. If unset,
   [state][google.cloud.kms.v1.CryptoKeyVersion.state] will be set to
   [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName parent = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     CryptoKeyVersion cryptoKeyVersion = CryptoKeyVersion.newBuilder().build();
     CryptoKeyVersion response = keyManagementServiceClient.createCryptoKeyVersion(parent, cryptoKeyVersion);
   }

  parent - Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion]. - `com.google.cloud.kms.v1.CryptoKeyName`
  crypto-key-version - A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values. - `com.google.cloud.kms.v1.CryptoKeyVersion`

  returns: `com.google.cloud.kms.v1.CryptoKeyVersion`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKeyVersion [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyName parent ^com.google.cloud.kms.v1.CryptoKeyVersion crypto-key-version]
    (-> this (.createCryptoKeyVersion parent crypto-key-version)))
  (^com.google.cloud.kms.v1.CryptoKeyVersion [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest request]
    (-> this (.createCryptoKeyVersion request))))

(defn create-import-job
  "Create a new [ImportJob][google.cloud.kms.v1.ImportJob] within a
   [KeyRing][google.cloud.kms.v1.KeyRing].

   [ImportJob.import_method][google.cloud.kms.v1.ImportJob.import_method] is required.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     String importJobId = \"my-import-job\";
     ImportJob.ImportMethod importMethod = ImportJob.ImportMethod.RSA_OAEP_3072_SHA1_AES_256;
     ProtectionLevel protectionLevel = ProtectionLevel.HSM;
     ImportJob importJob = ImportJob.newBuilder()
       .setImportMethod(importMethod)
       .setProtectionLevel(protectionLevel)
       .build();
     ImportJob response = keyManagementServiceClient.createImportJob(parent, importJobId, importJob);
   }

  parent - Required. The [name][google.cloud.kms.v1.KeyRing.name] of the [KeyRing][google.cloud.kms.v1.KeyRing] associated with the [ImportJobs][google.cloud.kms.v1.ImportJob]. - `com.google.cloud.kms.v1.KeyRingName`
  import-job-id - Required. It must be unique within a KeyRing and match the regular expression `[a-zA-Z0-9_-]{1,63}` - `java.lang.String`
  import-job - Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field values. - `com.google.cloud.kms.v1.ImportJob`

  returns: `com.google.cloud.kms.v1.ImportJob`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.ImportJob [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.KeyRingName parent ^java.lang.String import-job-id ^com.google.cloud.kms.v1.ImportJob import-job]
    (-> this (.createImportJob parent import-job-id import-job)))
  (^com.google.cloud.kms.v1.ImportJob [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CreateImportJobRequest request]
    (-> this (.createImportJob request))))

(defn list-crypto-keys-callable
  "Lists [CryptoKeys][google.cloud.kms.v1.CryptoKey].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     ListCryptoKeysRequest request = ListCryptoKeysRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListCryptoKeysResponse response = keyManagementServiceClient.listCryptoKeysCallable().call(request);
       for (CryptoKey element : response.getCryptoKeysList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListCryptoKeysRequest,com.google.cloud.kms.v1.ListCryptoKeysResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.listCryptoKeysCallable))))

(defn get-key-ring-callable
  "Returns metadata for a given [KeyRing][google.cloud.kms.v1.KeyRing].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName name = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     GetKeyRingRequest request = GetKeyRingRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<KeyRing> future = keyManagementServiceClient.getKeyRingCallable().futureCall(request);
     // Do something
     KeyRing response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetKeyRingRequest,com.google.cloud.kms.v1.KeyRing>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.getKeyRingCallable))))

(defn get-public-key-callable
  "Returns the public key for the given [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion].
   The [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] must be
   [ASYMMETRIC_SIGN][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ASYMMETRIC_SIGN] or
   [ASYMMETRIC_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ASYMMETRIC_DECRYPT].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     GetPublicKeyRequest request = GetPublicKeyRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<PublicKey> future = keyManagementServiceClient.getPublicKeyCallable().futureCall(request);
     // Do something
     PublicKey response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.GetPublicKeyRequest,com.google.cloud.kms.v1.PublicKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.getPublicKeyCallable))))

(defn set-iam-policy-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     ResourceName resource = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = keyManagementServiceClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.setIamPolicyCallable))))

(defn encrypt-callable
  "Encrypts data, so that it can only be recovered by a call to
   [Decrypt][google.cloud.kms.v1.KeyManagementService.Decrypt]. The
   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] must be
   [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyPathName name = CryptoKeyPathName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY_PATH]\");
     ByteString plaintext = ByteString.copyFromUtf8(\"\");
     EncryptRequest request = EncryptRequest.newBuilder()
       .setName(name.toString())
       .setPlaintext(plaintext)
       .build();
     ApiFuture<EncryptResponse> future = keyManagementServiceClient.encryptCallable().futureCall(request);
     // Do something
     EncryptResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.EncryptRequest,com.google.cloud.kms.v1.EncryptResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.encryptCallable))))

(defn close
  ""
  ([^KeyManagementServiceClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns permissions that a caller has on the specified resource. If the resource does not
   exist, this will return an empty set of permissions, not a NOT_FOUND error.

   Note: This operation is designed to be used for building permission-aware UIs and
   command-line tools, not for authorization checking. This operation may \"fail open\" without
   warning.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     ResourceName resource = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(resource.toString())
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = keyManagementServiceClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.testIamPermissionsCallable))))

(defn asymmetric-sign
  "Signs data using a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] ASYMMETRIC_SIGN, producing a
   signature that can be verified with the public key retrieved from
   [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     Digest digest = Digest.newBuilder().build();
     AsymmetricSignResponse response = keyManagementServiceClient.asymmetricSign(name, digest);
   }

  name - Required. The resource name of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for signing. - `com.google.cloud.kms.v1.CryptoKeyVersionName`
  digest - Required. The digest of the data to sign. The digest must be produced with the same digest algorithm as specified by the key version's [algorithm][google.cloud.kms.v1.CryptoKeyVersion.algorithm]. - `com.google.cloud.kms.v1.Digest`

  returns: `com.google.cloud.kms.v1.AsymmetricSignResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.AsymmetricSignResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyVersionName name ^com.google.cloud.kms.v1.Digest digest]
    (-> this (.asymmetricSign name digest)))
  (^com.google.cloud.kms.v1.AsymmetricSignResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.AsymmetricSignRequest request]
    (-> this (.asymmetricSign request))))

(defn get-iam-policy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists
   and does not have a policy set.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyName resource = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     Policy response = keyManagementServiceClient.getIamPolicy(resource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `com.google.cloud.kms.v1.KeyName`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.KeyName resource]
    (-> this (.getIamPolicy resource))))

(defn asymmetric-sign-callable
  "Signs data using a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with
   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] ASYMMETRIC_SIGN, producing a
   signature that can be verified with the public key retrieved from
   [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     Digest digest = Digest.newBuilder().build();
     AsymmetricSignRequest request = AsymmetricSignRequest.newBuilder()
       .setName(name.toString())
       .setDigest(digest)
       .build();
     ApiFuture<AsymmetricSignResponse> future = keyManagementServiceClient.asymmetricSignCallable().futureCall(request);
     // Do something
     AsymmetricSignResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.AsymmetricSignRequest,com.google.cloud.kms.v1.AsymmetricSignResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.asymmetricSignCallable))))

(defn destroy-crypto-key-version
  "Schedule a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] for destruction.

   Upon calling this method,
   [CryptoKeyVersion.state][google.cloud.kms.v1.CryptoKeyVersion.state] will be set to
   [DESTROY_SCHEDULED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROY_SCHEDULED]
   and [destroy_time][google.cloud.kms.v1.CryptoKeyVersion.destroy_time] will be set to a time 24
   hours in the future, at which point the [state][google.cloud.kms.v1.CryptoKeyVersion.state]
   will be changed to
   [DESTROYED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DESTROYED], and the key
   material will be irrevocably destroyed.

   Before the [destroy_time][google.cloud.kms.v1.CryptoKeyVersion.destroy_time] is reached,
   [RestoreCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.RestoreCryptoKeyVersion] may
   be called to reverse the process.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyVersionName name = CryptoKeyVersionName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\", \"[CRYPTO_KEY_VERSION]\");
     CryptoKeyVersion response = keyManagementServiceClient.destroyCryptoKeyVersion(name);
   }

  name - The resource name of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to destroy. - `com.google.cloud.kms.v1.CryptoKeyVersionName`

  returns: `com.google.cloud.kms.v1.CryptoKeyVersion`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKeyVersion [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyVersionName name]
    (-> this (.destroyCryptoKeyVersion name))))

(defn create-import-job-callable
  "Create a new [ImportJob][google.cloud.kms.v1.ImportJob] within a
   [KeyRing][google.cloud.kms.v1.KeyRing].

   [ImportJob.import_method][google.cloud.kms.v1.ImportJob.import_method] is required.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     String importJobId = \"my-import-job\";
     ImportJob.ImportMethod importMethod = ImportJob.ImportMethod.RSA_OAEP_3072_SHA1_AES_256;
     ProtectionLevel protectionLevel = ProtectionLevel.HSM;
     ImportJob importJob = ImportJob.newBuilder()
       .setImportMethod(importMethod)
       .setProtectionLevel(protectionLevel)
       .build();
     CreateImportJobRequest request = CreateImportJobRequest.newBuilder()
       .setParent(parent.toString())
       .setImportJobId(importJobId)
       .setImportJob(importJob)
       .build();
     ApiFuture<ImportJob> future = keyManagementServiceClient.createImportJobCallable().futureCall(request);
     // Do something
     ImportJob response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.CreateImportJobRequest,com.google.cloud.kms.v1.ImportJob>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.createImportJobCallable))))

(defn list-crypto-key-versions-paged-callable
  "Lists [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName parent = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     ListCryptoKeyVersionsRequest request = ListCryptoKeyVersionsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListCryptoKeyVersionsPagedResponse> future = keyManagementServiceClient.listCryptoKeyVersionsPagedCallable().futureCall(request);
     // Do something
     for (CryptoKeyVersion element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListCryptoKeyVersionsRequest,com.google.cloud.kms.v1.KeyManagementServiceClient$ListCryptoKeyVersionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.listCryptoKeyVersionsPagedCallable))))

(defn update-crypto-key-primary-version
  "Update the version of a [CryptoKey][google.cloud.kms.v1.CryptoKey] that will be used in
   [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt].

   Returns an error if called on an asymmetric key.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName name = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     String cryptoKeyVersionId = \"\";
     CryptoKey response = keyManagementServiceClient.updateCryptoKeyPrimaryVersion(name, cryptoKeyVersionId);
   }

  name - The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to update. - `com.google.cloud.kms.v1.CryptoKeyName`
  crypto-key-version-id - The id of the child [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary. - `java.lang.String`

  returns: `com.google.cloud.kms.v1.CryptoKey`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKey [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyName name ^java.lang.String crypto-key-version-id]
    (-> this (.updateCryptoKeyPrimaryVersion name crypto-key-version-id)))
  (^com.google.cloud.kms.v1.CryptoKey [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest request]
    (-> this (.updateCryptoKeyPrimaryVersion request))))

(defn decrypt
  "Decrypts data that was protected by
   [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt]. The
   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] must be
   [ENCRYPT_DECRYPT][google.cloud.kms.v1.CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKeyName name = CryptoKeyName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[CRYPTO_KEY]\");
     ByteString ciphertext = ByteString.copyFromUtf8(\"\");
     DecryptResponse response = keyManagementServiceClient.decrypt(name, ciphertext);
   }

  name - Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to use for decryption. The server will choose the appropriate version. - `com.google.cloud.kms.v1.CryptoKeyName`
  ciphertext - Required. The encrypted data originally returned in [EncryptResponse.ciphertext][google.cloud.kms.v1.EncryptResponse.ciphertext]. - `com.google.protobuf.ByteString`

  returns: `com.google.cloud.kms.v1.DecryptResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.DecryptResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKeyName name ^com.google.protobuf.ByteString ciphertext]
    (-> this (.decrypt name ciphertext)))
  (^com.google.cloud.kms.v1.DecryptResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.DecryptRequest request]
    (-> this (.decrypt request))))

(defn get-import-job
  "Returns metadata for a given [ImportJob][google.cloud.kms.v1.ImportJob].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     ImportJobName name = ImportJobName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\", \"[IMPORT_JOB]\");
     ImportJob response = keyManagementServiceClient.getImportJob(name);
   }

  name - The [name][google.cloud.kms.v1.ImportJob.name] of the [ImportJob][google.cloud.kms.v1.ImportJob] to get. - `com.google.cloud.kms.v1.ImportJobName`

  returns: `com.google.cloud.kms.v1.ImportJob`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.ImportJob [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.ImportJobName name]
    (-> this (.getImportJob name))))

(defn list-import-jobs-paged-callable
  "Lists [ImportJobs][google.cloud.kms.v1.ImportJob].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     ListImportJobsRequest request = ListImportJobsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListImportJobsPagedResponse> future = keyManagementServiceClient.listImportJobsPagedCallable().futureCall(request);
     // Do something
     for (ImportJob element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListImportJobsRequest,com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.listImportJobsPagedCallable))))

(defn update-crypto-key
  "Update a [CryptoKey][google.cloud.kms.v1.CryptoKey].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     CryptoKey cryptoKey = CryptoKey.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     CryptoKey response = keyManagementServiceClient.updateCryptoKey(cryptoKey, updateMask);
   }

  crypto-key - [CryptoKey][google.cloud.kms.v1.CryptoKey] with updated values. - `com.google.cloud.kms.v1.CryptoKey`
  update-mask - Required list of fields to be updated in this request. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.kms.v1.CryptoKey`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.CryptoKey [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.CryptoKey crypto-key ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateCryptoKey crypto-key update-mask)))
  (^com.google.cloud.kms.v1.CryptoKey [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.UpdateCryptoKeyRequest request]
    (-> this (.updateCryptoKey request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^KeyManagementServiceClient this]
    (-> this (.isTerminated))))

(defn create-crypto-key-callable
  "Create a new [CryptoKey][google.cloud.kms.v1.CryptoKey] within a
   [KeyRing][google.cloud.kms.v1.KeyRing].

   [CryptoKey.purpose][google.cloud.kms.v1.CryptoKey.purpose] and
   [CryptoKey.version_template.algorithm][google.cloud.kms.v1.CryptoKeyVersionTemplate.algorithm]
   are required.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     String cryptoKeyId = \"my-app-key\";
     CryptoKey.CryptoKeyPurpose purpose = CryptoKey.CryptoKeyPurpose.ENCRYPT_DECRYPT;
     long seconds = 2147483647L;
     Timestamp nextRotationTime = Timestamp.newBuilder()
       .setSeconds(seconds)
       .build();
     long seconds2 = 604800L;
     Duration rotationPeriod = Duration.newBuilder()
       .setSeconds(seconds2)
       .build();
     CryptoKey cryptoKey = CryptoKey.newBuilder()
       .setPurpose(purpose)
       .setNextRotationTime(nextRotationTime)
       .setRotationPeriod(rotationPeriod)
       .build();
     CreateCryptoKeyRequest request = CreateCryptoKeyRequest.newBuilder()
       .setParent(parent.toString())
       .setCryptoKeyId(cryptoKeyId)
       .setCryptoKey(cryptoKey)
       .build();
     ApiFuture<CryptoKey> future = keyManagementServiceClient.createCryptoKeyCallable().futureCall(request);
     // Do something
     CryptoKey response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.CreateCryptoKeyRequest,com.google.cloud.kms.v1.CryptoKey>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.createCryptoKeyCallable))))

(defn list-import-jobs
  "Lists [ImportJobs][google.cloud.kms.v1.ImportJob].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyRingName parent = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     for (ImportJob element : keyManagementServiceClient.listImportJobs(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The resource name of the [KeyRing][google.cloud.kms.v1.KeyRing] to list, in the format `projects/*/locations/*/keyRings/*`. - `com.google.cloud.kms.v1.KeyRingName`

  returns: `com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.kms.v1.KeyManagementServiceClient$ListImportJobsPagedResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.KeyRingName parent]
    (-> this (.listImportJobs parent))))

(defn shutdown-now
  ""
  ([^KeyManagementServiceClient this]
    (-> this (.shutdownNow))))

(defn test-iam-permissions
  "Returns permissions that a caller has on the specified resource. If the resource does not
   exist, this will return an empty set of permissions, not a NOT_FOUND error.

   Note: This operation is designed to be used for building permission-aware UIs and
   command-line tools, not for authorization checking. This operation may \"fail open\" without
   warning.

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     KeyName resource = KeyRingName.of(\"[PROJECT]\", \"[LOCATION]\", \"[KEY_RING]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = keyManagementServiceClient.testIamPermissions(resource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `com.google.cloud.kms.v1.KeyName`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^KeyManagementServiceClient this ^com.google.cloud.kms.v1.KeyName resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^KeyManagementServiceClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

(defn list-key-rings-paged-callable
  "Lists [KeyRings][google.cloud.kms.v1.KeyRing].

   Sample code:



   try (KeyManagementServiceClient keyManagementServiceClient = KeyManagementServiceClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListKeyRingsRequest request = ListKeyRingsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListKeyRingsPagedResponse> future = keyManagementServiceClient.listKeyRingsPagedCallable().futureCall(request);
     // Do something
     for (KeyRing element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.kms.v1.ListKeyRingsRequest,com.google.cloud.kms.v1.KeyManagementServiceClient$ListKeyRingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^KeyManagementServiceClient this]
    (-> this (.listKeyRingsPagedCallable))))

