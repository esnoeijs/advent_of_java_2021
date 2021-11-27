{ pkgs ? import <nixpkgs> {} }:
  let maven = pkgs.maven.override {
    jdk = pkgs.jdk17_headless;
  };
  in pkgs.mkShell {
    nativeBuildInputs = [ pkgs.jdk17_headless maven ];
}