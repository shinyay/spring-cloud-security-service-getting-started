# Spring Cloud Security Application with OAuth2 JWT

Overview

## Description

- [DockerHub: shinyay/
spring-cloud-security-service-gs](https://cloud.docker.com/repository/docker/shinyay/spring-cloud-security-service-gs)

- [Related Gateway:spring-cloud-security-gateway-gs](https://github.com/shinyay/spring-cloud-security-gateway-getting-started)

### Implementation

#### `@AuthenticationPrincipal`

It binds a method parameter or method return value to the Authentication.getPrincipal()

認証済みのセッション情報を取得

#### Configuring Authorization Components
[ServerHttpSecurity](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/config/web/server/ServerHttpSecurity.html) surfaces components for customizing security behaviour

|Component|ServerHttpSecurity method|Use case|
|---------|-------------------------|--------|
|AuthorizeExchangeSpec|.authorizeExchange()|pathMatchers, RBAC, custom Authorization|
|HeadersSpec|.headers()|Cross Site Scriptiong, Strict Transport Security, cache-control, frame options, etc…|
|CsrfSpec|.csrf()|setup handler and token repository|
|ExceptionHandlingSpec|.exceptionHandling()|handler for authentication entry point and denial|
|HttpBasicSpec|.httpBasic()|custom AuthenticationManager, authentication context config|
|RequestCacheSpec|.requestCache()|handle saving httpRequest prior to authentication|
|FormLoginSpec|.formLogin()|set login page, authentication behaviour on success/deny|
|LogoutSpec|.logout()|set logout page and handler|

##### Path Pattern

- **pathMatchers()**
  - public T pathMatchers(org.springframework.http.HttpMethod method)
  - public T pathMatchers(java.lang.String... antPatterns)
  - public T pathMatchers(org.springframework.http.HttpMethod method, java.lang.String... antPatterns)

##### ServerHttpSecurity.AuthorizeExchangeSpec.Access

|Function|Description|
|--------|-----------|
|access|Allows plugging in a custom authorization strategy|
|authenticated|Require an authenticated user|
|denyAll|Deny access for everyone|
|hasAuthority|Require a specific authority|
|hasRole|Require a specific role|
|permitAll|Allow access for anyone|

- hasAuthority / hasRole
  - In the case of `hasRole`, **ROLE_** prefix is supplemented

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
