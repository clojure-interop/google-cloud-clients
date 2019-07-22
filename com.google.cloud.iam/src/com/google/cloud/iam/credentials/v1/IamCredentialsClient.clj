(ns com.google.cloud.iam.credentials.v1.IamCredentialsClient
  "Service Description: A service account is a special type of Google account that belongs to your
  application or a virtual machine (VM), instead of to an individual end user. Your application
  assumes the identity of the service account to call Google APIs, so that the users aren't
  directly involved.

  Service account credentials are used to temporarily assume the identity of the service
  account. Supported credential types include OAuth 2.0 access tokens, OpenID Connect ID tokens,
  self-signed JSON Web Tokens (JWTs), and more.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
    ServiceAccountName name = ServiceAccountName.of(\"[PROJECT]\", \"[SERVICE_ACCOUNT]\");
    List<String> delegates = new ArrayList<>();
    List<String> scope = new ArrayList<>();
    Duration lifetime = Duration.newBuilder().build();
    GenerateAccessTokenResponse response = iamCredentialsClient.generateAccessToken(name, delegates, scope, lifetime);
  }

  Note: close() needs to be called on the iamCredentialsClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of IamCredentialsSettings to
  create(). For example:

  To customize credentials:



  IamCredentialsSettings iamCredentialsSettings =
      IamCredentialsSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  IamCredentialsClient iamCredentialsClient =
      IamCredentialsClient.create(iamCredentialsSettings);

  To customize the endpoint:



  IamCredentialsSettings iamCredentialsSettings =
      IamCredentialsSettings.newBuilder().setEndpoint(myEndpoint).build();
  IamCredentialsClient iamCredentialsClient =
      IamCredentialsClient.create(iamCredentialsSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.iam.credentials.v1 IamCredentialsClient]))

(defn *create
  "Constructs an instance of IamCredentialsClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.iam.credentials.v1.IamCredentialsSettings`

  returns: `com.google.cloud.iam.credentials.v1.IamCredentialsClient`

  throws: java.io.IOException"
  (^com.google.cloud.iam.credentials.v1.IamCredentialsClient [^com.google.cloud.iam.credentials.v1.IamCredentialsSettings settings]
    (IamCredentialsClient/create settings))
  (^com.google.cloud.iam.credentials.v1.IamCredentialsClient []
    (IamCredentialsClient/create )))

(defn sign-jwt
  "Signs a JWT using a service account's system-managed private key.

   Sample code:



   try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
     ServiceAccountName name = ServiceAccountName.of(\"[PROJECT]\", \"[SERVICE_ACCOUNT]\");
     List<String> delegates = new ArrayList<>();
     String payload = \"\";
     SignJwtResponse response = iamCredentialsClient.signJwt(name, delegates, payload);
   }

  name - The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. - `com.google.cloud.iam.credentials.v1.ServiceAccountName`
  delegates - The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}` - `java.util.List`
  payload - The JWT payload to sign: a JSON object that contains a JWT Claims Set. - `java.lang.String`

  returns: `com.google.cloud.iam.credentials.v1.SignJwtResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iam.credentials.v1.SignJwtResponse [^IamCredentialsClient this ^com.google.cloud.iam.credentials.v1.ServiceAccountName name ^java.util.List delegates ^java.lang.String payload]
    (-> this (.signJwt name delegates payload)))
  (^com.google.cloud.iam.credentials.v1.SignJwtResponse [^IamCredentialsClient this ^com.google.cloud.iam.credentials.v1.SignJwtRequest request]
    (-> this (.signJwt request))))

(defn get-settings
  "returns: `com.google.cloud.iam.credentials.v1.IamCredentialsSettings`"
  (^com.google.cloud.iam.credentials.v1.IamCredentialsSettings [^IamCredentialsClient this]
    (-> this (.getSettings))))

(defn sign-blob
  "Signs a blob using a service account's system-managed private key.

   Sample code:



   try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
     ServiceAccountName name = ServiceAccountName.of(\"[PROJECT]\", \"[SERVICE_ACCOUNT]\");
     List<String> delegates = new ArrayList<>();
     ByteString payload = ByteString.copyFromUtf8(\"\");
     SignBlobResponse response = iamCredentialsClient.signBlob(name, delegates, payload);
   }

  name - The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. - `com.google.cloud.iam.credentials.v1.ServiceAccountName`
  delegates - The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}` - `java.util.List`
  payload - The bytes to sign. - `com.google.protobuf.ByteString`

  returns: `com.google.cloud.iam.credentials.v1.SignBlobResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iam.credentials.v1.SignBlobResponse [^IamCredentialsClient this ^com.google.cloud.iam.credentials.v1.ServiceAccountName name ^java.util.List delegates ^com.google.protobuf.ByteString payload]
    (-> this (.signBlob name delegates payload)))
  (^com.google.cloud.iam.credentials.v1.SignBlobResponse [^IamCredentialsClient this ^com.google.cloud.iam.credentials.v1.SignBlobRequest request]
    (-> this (.signBlob request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.iam.credentials.v1.stub.IamCredentialsStub`"
  ([^IamCredentialsClient this]
    (-> this (.getStub))))

(defn generate-access-token
  "Generates an OAuth 2.0 access token for a service account.

   Sample code:



   try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
     ServiceAccountName name = ServiceAccountName.of(\"[PROJECT]\", \"[SERVICE_ACCOUNT]\");
     List<String> delegates = new ArrayList<>();
     List<String> scope = new ArrayList<>();
     Duration lifetime = Duration.newBuilder().build();
     GenerateAccessTokenResponse response = iamCredentialsClient.generateAccessToken(name, delegates, scope, lifetime);
   }

  name - The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. - `com.google.cloud.iam.credentials.v1.ServiceAccountName`
  delegates - The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}` - `java.util.List`
  scope - Code to identify the scopes to be included in the OAuth 2.0 access token. See https://developers.google.com/identity/protocols/googlescopes for more information. At least one value required. - `java.util.List`
  lifetime - The desired lifetime duration of the access token in seconds. Must be set to a value less than or equal to 3600 (1 hour). If a value is not specified, the token's lifetime will be set to a default value of one hour. - `com.google.protobuf.Duration`

  returns: `com.google.cloud.iam.credentials.v1.GenerateAccessTokenResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iam.credentials.v1.GenerateAccessTokenResponse [^IamCredentialsClient this ^com.google.cloud.iam.credentials.v1.ServiceAccountName name ^java.util.List delegates ^java.util.List scope ^com.google.protobuf.Duration lifetime]
    (-> this (.generateAccessToken name delegates scope lifetime)))
  (^com.google.cloud.iam.credentials.v1.GenerateAccessTokenResponse [^IamCredentialsClient this ^com.google.cloud.iam.credentials.v1.GenerateAccessTokenRequest request]
    (-> this (.generateAccessToken request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^IamCredentialsClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^IamCredentialsClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^IamCredentialsClient this]
    (-> this (.shutdown))))

(defn sign-blob-callable
  "Signs a blob using a service account's system-managed private key.

   Sample code:



   try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
     ServiceAccountName name = ServiceAccountName.of(\"[PROJECT]\", \"[SERVICE_ACCOUNT]\");
     ByteString payload = ByteString.copyFromUtf8(\"\");
     SignBlobRequest request = SignBlobRequest.newBuilder()
       .setName(name.toString())
       .setPayload(payload)
       .build();
     ApiFuture<SignBlobResponse> future = iamCredentialsClient.signBlobCallable().futureCall(request);
     // Do something
     SignBlobResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.SignBlobRequest,com.google.cloud.iam.credentials.v1.SignBlobResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IamCredentialsClient this]
    (-> this (.signBlobCallable))))

(defn close
  ""
  ([^IamCredentialsClient this]
    (-> this (.close))))

(defn generate-id-token-callable
  "Generates an OpenID Connect ID token for a service account.

   Sample code:



   try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
     ServiceAccountName name = ServiceAccountName.of(\"[PROJECT]\", \"[SERVICE_ACCOUNT]\");
     String audience = \"\";
     GenerateIdTokenRequest request = GenerateIdTokenRequest.newBuilder()
       .setName(name.toString())
       .setAudience(audience)
       .build();
     ApiFuture<GenerateIdTokenResponse> future = iamCredentialsClient.generateIdTokenCallable().futureCall(request);
     // Do something
     GenerateIdTokenResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.GenerateIdTokenRequest,com.google.cloud.iam.credentials.v1.GenerateIdTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IamCredentialsClient this]
    (-> this (.generateIdTokenCallable))))

(defn sign-jwt-callable
  "Signs a JWT using a service account's system-managed private key.

   Sample code:



   try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
     ServiceAccountName name = ServiceAccountName.of(\"[PROJECT]\", \"[SERVICE_ACCOUNT]\");
     String payload = \"\";
     SignJwtRequest request = SignJwtRequest.newBuilder()
       .setName(name.toString())
       .setPayload(payload)
       .build();
     ApiFuture<SignJwtResponse> future = iamCredentialsClient.signJwtCallable().futureCall(request);
     // Do something
     SignJwtResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.SignJwtRequest,com.google.cloud.iam.credentials.v1.SignJwtResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IamCredentialsClient this]
    (-> this (.signJwtCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^IamCredentialsClient this]
    (-> this (.isTerminated))))

(defn generate-access-token-callable
  "Generates an OAuth 2.0 access token for a service account.

   Sample code:



   try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
     ServiceAccountName name = ServiceAccountName.of(\"[PROJECT]\", \"[SERVICE_ACCOUNT]\");
     List<String> scope = new ArrayList<>();
     GenerateAccessTokenRequest request = GenerateAccessTokenRequest.newBuilder()
       .setName(name.toString())
       .addAllScope(scope)
       .build();
     ApiFuture<GenerateAccessTokenResponse> future = iamCredentialsClient.generateAccessTokenCallable().futureCall(request);
     // Do something
     GenerateAccessTokenResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.iam.credentials.v1.GenerateAccessTokenRequest,com.google.cloud.iam.credentials.v1.GenerateAccessTokenResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^IamCredentialsClient this]
    (-> this (.generateAccessTokenCallable))))

(defn shutdown-now
  ""
  ([^IamCredentialsClient this]
    (-> this (.shutdownNow))))

(defn generate-id-token
  "Generates an OpenID Connect ID token for a service account.

   Sample code:



   try (IamCredentialsClient iamCredentialsClient = IamCredentialsClient.create()) {
     ServiceAccountName name = ServiceAccountName.of(\"[PROJECT]\", \"[SERVICE_ACCOUNT]\");
     List<String> delegates = new ArrayList<>();
     String audience = \"\";
     boolean includeEmail = false;
     GenerateIdTokenResponse response = iamCredentialsClient.generateIdToken(name, delegates, audience, includeEmail);
   }

  name - The resource name of the service account for which the credentials are requested, in the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. - `com.google.cloud.iam.credentials.v1.ServiceAccountName`
  delegates - The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}` - `java.util.List`
  audience - The audience for the token, such as the API or account that this token grants access to. - `java.lang.String`
  include-email - Include the service account email in the token. If set to `true`, the token will contain `email` and `email_verified` claims. - `boolean`

  returns: `com.google.cloud.iam.credentials.v1.GenerateIdTokenResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.iam.credentials.v1.GenerateIdTokenResponse [^IamCredentialsClient this ^com.google.cloud.iam.credentials.v1.ServiceAccountName name ^java.util.List delegates ^java.lang.String audience ^Boolean include-email]
    (-> this (.generateIdToken name delegates audience include-email)))
  (^com.google.cloud.iam.credentials.v1.GenerateIdTokenResponse [^IamCredentialsClient this ^com.google.cloud.iam.credentials.v1.GenerateIdTokenRequest request]
    (-> this (.generateIdToken request))))

