prefix="group1-team3"
app="accounts-service"
ver="0.2.13"

echo "docker uildx build --platform linux/amd64,linux/arm64 -t k8s-vga-worker1:5000/${prefix}-${app}:v${ver} --push ."
#docker build -t k8s-vga-worker1:5000/${prefix}-${app}:v${ver} ./
#docker push k8s-vga-worker1:5000/${prefix}-${app}:v${ver}

docker buildx build --platform linux/amd64,linux/arm64 -t k8s-vga-worker1:5000/${prefix}-${app}:v${ver} --push .
