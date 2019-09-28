# Spring Cloud Security Application with OAuth2 JWT

Overview

## Description

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
